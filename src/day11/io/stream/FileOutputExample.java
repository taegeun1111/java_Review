package day11.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputExample {

    public static void main(String[] args) {
        String msg = "멍멍이는 왈왈 \n하하호호";

        //데이터를 외부로 내보낼 때 출력스트림 사용
//        new OutputStream();
//        => 추상 클래스이기 때문에 new OutputStream안됨
//        => 대신 자식 클래스 FileOutputStream 생성. 타입은 OutputStream도 사용 가능.
//        => FileOutputStream 예외처리(파일이 열려 있다, 이미 존재한다, 폴더가 없다 등)
//        => write IO예외처리
//        => 다음 전송을 위해 FileOutputStream을 닫아줘야 한다.

        try (FileOutputStream fos = new FileOutputStream("/Users/taegeun/exercise/dog.txt");) {
//        => Byte기반 Stream이기 때문에 Byte로 변환해줘야 한다.
            fos.write(msg.getBytes());
            System.out.println("파일 저장에 성공했습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 처리에 실패했습니다.");
        } catch (IOException e) {
            System.out.println("출력 시스템에 문제가 생겼습니다.");
        }

        //직접적인 close문법
        /*
        FileOutputStream fos = null;
        fos = new FileOutputStream("/Users/taegeun/exercise/dog.txt");)

        finally{
            try {
        =>null의 값이 있을 수 있기 때문에 null을 체크해줘야한다.
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */

    }
}
