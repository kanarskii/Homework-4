import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Задай размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array));
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                countZero++;
            }
        }
        if(countZero != 0){
            System.out.println("Количество нулей в массиве " + countZero);
        }else{
            System.out.println("В массиве нету нулей");
        }
    }
}
