package lesson_2_exceptions;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(authenticate("1145gh_fsg", "12345", "12345"));
    }

    public static boolean authenticate(String login, String password, String confirmPassword) {
        Pattern pattern = Pattern.compile("[[A-Za-z]\\d_]{1,19}");
        try {
            if (!Pattern.matches(pattern.pattern(), login)) {
                throw new WrongLoginException("Логин не соответсвует условию");
            }
            if (!Pattern.matches(pattern.pattern(), password)) {
                throw new WrongPasswordException("Пароль не соответствует условию");
            }
            if (!Pattern.matches(pattern.pattern(), confirmPassword)) {
                throw new WrongPasswordException("Подтверждение пароля не соотвествует условию");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("password и confirm_password не равны");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
