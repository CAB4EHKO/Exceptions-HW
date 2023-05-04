public class Main {
    public static void main(String[] args) {
        try {
            RegistrationService.registrationForm("Kak_budda", "Sky2023Pro", "Sky2023Pro");
        } catch (InvalidCharacterException e) {
            System.out.println("Логин и пароль могут содержать только латинские буквы, цифры и знак подчёркивания.");
        } catch (WrongLoginException e) {
            System.out.println("Логин и пароль должны быть не длиннее 20 символов.");
        } catch (WrongPasswordException e) {
            System.out.println("Пароли не совподает.");
        }
    }
}