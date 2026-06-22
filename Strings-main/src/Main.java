import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String numString = String.valueOf(num);
        double result = 0;
        for (int i = 0; i < numString.length(); i++) {
            result += Integer.parseInt(String.valueOf(numString.charAt(i)));
        }

        return result/numString.length();
    }
}
