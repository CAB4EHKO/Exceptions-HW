public class RegistrationService {
    static void registrationForm(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException, InvalidCharacterException {

        if (!login.matches("[a-zA-Z0-9_]+") || !password.matches("[a-zA-Z0-9_]+") || !confirmPassword.matches("[a-zA-Z0-9_]+")) {
            throw new InvalidCharacterException();
        }
        if (login.length() > 20 || password.length() > 20) {
            throw new WrongLoginException();
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException();
        }
    }
}
