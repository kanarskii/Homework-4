import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Задай размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*20);
        }
        System.out.println("Выводим массив в консоль");
        System.out.println(Arrays.toString(array));

        System.out.println("Выводим массив в обратном порядке в консоль");
        for (int i = (array.length-1); i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
