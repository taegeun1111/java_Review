package day04.Array;

public class Main {
    public static void main(String[] args) {

        //생성자 호출
        StringList foodList = new StringList();
        StringList userNameList = new StringList();

        foodList.push("짜장면");
        foodList.push("볶음밥");
        foodList.push("탕수육");
        foodList.pop();
        System.out.println("foodList = " + foodList);

        StringList newdata = new StringList("홍길동","김철수");
        newdata.push("이정현");
        newdata.push("강현우");
//        newdata.clear();
//        System.out.println(newdata.isEmpty());

        System.out.println(newdata.toString());



        userNameList.push("김철수");
        userNameList.push("박영희");
    }
}
