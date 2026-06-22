public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        System.out.println("\n");
        for(int j = array.length - 1; j >= 0; j--){
            System.out.print(array[j]);
        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        System.out.println("\n");
        for(int k = 0; k < array.length / 2; k++){
            int temp = array[k];
            array[k] = array[array.length - k - 1];
            array[array.length - k - 1] = temp;
        }

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]);
        }
    }
}
