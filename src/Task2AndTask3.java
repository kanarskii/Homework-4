import java.util.Arrays;
import java.util.Scanner;

public class Task2AndTask3 {
    public static void main(String[] args) {
        System.out.println("Задай размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array));

        int maxNumber = array[0];
        int minNumber = array[0];
        int indexMaxNumber = 0;
        int indexMinNumber = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
                indexMaxNumber = i;
            }
            if (minNumber > array[i]) {
                minNumber = array[i];
                indexMinNumber = i;
            }
        }
        System.out.println("Min число = " + minNumber + " под индексом " + indexMinNumber + "; Max число= " + maxNumber +
                " под индексом " + indexMaxNumber + ";");
    }
}