package day13;

import day07.util.Utility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static day07.util.Utility.*;

public class Main {
    public static void main(String[] args) {

        //List.of(값)로 List를 생성하면 값을 변경할 수 없다.
        //List<Student> students = List.of(값)
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("송철수", 15, 79),
                        new Student("박영희", 25, 45),
                        new Student("손흥민", 11, 50),
                        new Student("감우성", 45, 80)
                )
        );

        students.forEach(s -> System.out.println(s));

        //나이 적은 순으로 오름차 정렬
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //오름차순
                return o1.getAge() - o2.getAge();
                //내림차순
                //return o2.getAge() - o1.getAge();
            }
        });
        makeLine();
        students.forEach(s -> System.out.println(s));


        //이름 가나다순으로 오름차 정렬
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        makeLine();
        students.forEach(s -> System.out.println(s));

        //stream을 이용해 정렬 -> Sorting클래스로


    }
}
