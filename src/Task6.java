import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,15,6,7,8};
        boolean value = true;

        for (int i = 1; i < array.length ; i++) {
            if(array[i] <= array[i-1]){
                value = false;
                break;
            }
        }
        if(value){
            System.out.println("Массив является возвростоющй последовательностью");
        }else{
            System.out.println("Массив не является возвростоющй последовательностью");
        }
    }
}
