import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {8, 7 , 6, 5, 4 ,3, 2, 1, 0};
        System.out.println(Arrays.toString(array));
        for( int i = 0, j = array.length-1; i < array.length/2; i ++, j--){
            int k = array[i];
            array[i] = array[j];
            array[j] = k;
        }
        System.out.println(Arrays.toString(array));
    }
}
