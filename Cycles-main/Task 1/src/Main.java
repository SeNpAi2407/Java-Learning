import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени

        boolean isCanCook = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во жабьх глаз:");
        toadEyesCount = input.nextInt();
        System.out.println("Введите кол-во слез вурдулаки:");
        ghoulTearsCount = input.nextInt();
        System.out.println("Введите кол-во костей ворона:");
        ravenBonesCount = input.nextInt();
        System.out.println("Введите кол-во пельменей:");
        dumplingsCount = input.nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        if(toadEyesCount >= 3 && ravenBonesCount >= 1){
            System.out.println("Вы можете приготовить эликсир зоркости");
            isCanCook = true;
        }
        if(ravenBonesCount >= 2 && dumplingsCount >= 4){
            System.out.println("Вы можете приготовить эликсир стойкости");
            isCanCook = true;
        }
        if(ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2){
            System.out.println("Вы можете приготовить эликсир скрытности");
            isCanCook = true;
        }
        if(ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3){
            System.out.println("Вы можете приготовить запертный эликсир");
            isCanCook = true;
        }
        if(!isCanCook){
            System.out.println("Вы не можете ничего приготовить\n");
        }
    }
}
