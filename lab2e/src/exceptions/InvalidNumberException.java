package exceptions;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(int invalidNumber) {
        super("Ошибка: Число " + invalidNumber + " не делится на 3 и 8.");
    }
}
