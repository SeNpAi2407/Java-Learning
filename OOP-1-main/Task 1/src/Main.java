import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;
    static double result = 0;

    public static void main(String[] args) {
        while(true) {
            a = inputDouble();
            b = inputDouble();

            System.out.println("Введите необходимое действие:\n 1 - суммированиe чисел\n 2 - умножениe чисел\n 3 - вычитаниe чисел\n 4 - делениe чисел\n 5 - выход");

            double choise = inputDouble();
            if (choise == 1) {
                sum();
            } else if (choise == 2) {
                multiply();
            } else if (choise == 3) {
                diff();
            } else if (choise == 4) {
                divide();
            } else if (choise == 5) {
                break;
            }
        }
    }

    private static void divide() {
        result = a / b;
        System.out.println("Результат :" + result);
    }

    private static void diff() {
        result = a - b;
        System.out.println("Результат :" + result);
    }

    private static void multiply() {
        result = a * b;
        System.out.println("Результат :" + result);
    }

    private static void sum() {
        result = a + b;
        System.out.println("Результат :" + result);
    }

    private static double inputDouble() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextDouble();
    }
}
