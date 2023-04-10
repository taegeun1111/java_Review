package day11.api.obj;

import day07.util.Utility;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Pen p1 = new Pen(123, "빨강", 1000);
        p1.company = new Company("모나미","서울");

        Pen p2 = new Pen(123, "빨강", 1000);

        System.out.println(p1);
        System.out.println(p1==p2); //false
        System.out.println(p1.equals(p2));

        Set<Pen> penSet = new HashSet<>();
        penSet.add(p1);
        penSet.add(p2);

        System.out.println(penSet.size());
        System.out.println(penSet);

        //10진수로 확인
        Utility.makeLine();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        //16진수로 확인
        System.out.println(Integer.toHexString(p1.hashCode()));
    }

    //왜 주소값이 나올까?
    //Pen의 부모가 object인데 상속받아서 toString을 사용해서 오버라이딩 가능
}
