package day10.exception_;

public class UserMain {
    public static void main(String[] args) {
        LoginUser user = new LoginUser("abc123","1234");
        try {
            String abc123 = user.loginValidate("abc123", "1234");
            System.out.println(abc123);
        } catch (LoginValidateException e) {
            System.out.println(e.getMessage());
        }
    }
}
