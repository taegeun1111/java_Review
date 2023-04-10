package day11.io.file;

import java.io.File;
import java.io.IOException;

public class FileExample {
    //psf : 상수 생성
    public static final String ROOT_PATH = "/Users/taegeun/exercise";

    public static void main(String[] args) {

        //폴더 생성
        //파일 정보 객체 생성
        File fileInfo = new File(ROOT_PATH + "/hello");
        if(!fileInfo.exists()) fileInfo.mkdir();
        //exercise 하위에 hello라는 폴더가 존재하지 않는다면 makeDirectory(mkdir)를 해라.

        //---------------------------------------------------------
        //파일 정보 객체 생성
        File file1 = new File(ROOT_PATH + "/file1.txt");
        File file2 = new File(ROOT_PATH + "/file2.txt");
        File file3 = new File(ROOT_PATH + "/file3.txt");

        //파일 생성 명령
        //불시의 상황(전원 코드 뽑힘 등)에 예외처리를 해라.
        try {
            if(!file1.exists()) file1.createNewFile();
            if(!file2.exists()) file2.createNewFile();
            if(!file3.exists()) file3.createNewFile();
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            e.printStackTrace();
        }


    }


}
