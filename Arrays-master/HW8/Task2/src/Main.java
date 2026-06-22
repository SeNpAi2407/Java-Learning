import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] weigth = new int[10];
        int min = 40;
        int max = 100;

        for(int i = 0; i < weigth.length; i++){
            weigth[i] = (int)(Math.random()*(max-min)+min);
        }

        for(int i = 0; i < weigth.length; i++){
            System.out.print(weigth[i] + " ");
        }

        int sum = 0;
        for(int i = 0; i < weigth.length; i++){
            sum += weigth[i];
        }

        double averweigth = (double)sum / weigth.length;
        System.out.println();
        System.out.print("Averweigth is " + averweigth);
        System.out.println();

        int peopleCount = 0;
        for(int i = 0; i < weigth.length; i++){
            if(weigth[i] > 60 && weigth[i] < 80){
                peopleCount++;
            }
        }
        System.out.println("People count is " + peopleCount);
    }
}
