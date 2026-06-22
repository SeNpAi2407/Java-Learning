import java.util.Scanner;

public class Main {

    static int number;

    public static void main(String[] args) {
        inputNumber();
        checkNumber();
    }

    private static int inputNumber() {
        System.out.println("Введите число:");
        number = new Scanner(System.in).nextInt();
        return number;
    }

    private static void checkNumber() {
        System.out.println(number % 2 == 0);
    }
}
