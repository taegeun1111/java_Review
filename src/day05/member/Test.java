package day05.member;

public class Test {

    public static void main(String[] args) {
        MemberRepository mr = new MemberRepository();


        Member thief = new Member(4,"233@4567.com", "5555",
                "도둑",Gender.MALE,55);
        mr.addMembers(thief);
        mr.addMembers(thief);

        mr.showMembers();

        boolean flag = mr.isDupulicateEmail("123@123.com");
        System.out.println("flag = " + flag);

    }




}
