package day11.io.objstream;

import day11.io.Path;
import day11.io.objstream.Snack.Taste;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static day11.io.objstream.Snack.Taste.*;

public class SaveSnack {
    private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {
        snackList.add(new Snack("콘칲",1970,1500, GOOD));
        snackList.add(new Snack("사브레",1980,2500, BAD));
        snackList.add(new Snack("오징어집",1985,1800, SOSO));

        saveFile();
    }

    /**
     *객체를 통채로 파일에 저장(권장)
     * NotSerializableException : 직렬화
     * 객체들을 한 줄로 세워 Stream을 통과시켜줘야 한다.
     * List는 내부 데이터를 보면 직렬화가 되어 있지만
     * Snack은 커스텀으로 만든 타입이기 때문에 직렬화가 되어있지 않다.
     *
     */

    private static void saveFile(){
        try(FileOutputStream fos = new FileOutputStream(Path.ROOT_PATH+"/snack.txt")){
            //객체 저장을 위한 보조 스트림 사용
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //텍스트파일로 리스트 데이터 저장(고전 방식)
    private static void saveTextFile(){
        try(FileWriter fw = new FileWriter(Path.ROOT_PATH+"/snack.txt")) {
            for (Snack snack : snackList) {
            fw.write(String.format("%s,%d,%d,%s\r\n",
                    snack.getSnackName(),snack.getYear(),snack.getPrice(),snack.getTaste()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }






}
