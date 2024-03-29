import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {9,9,9};
        int number = 0;
        for(int y: array){
            number = 10 * number + y;
        }
        number++;
        String numberString = Integer.toString(number);
        char[] charArray = numberString.toCharArray();
        int[] array2 = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            array2[i] = Character.getNumericValue(charArray[i]);
        }
        System.out.println(Arrays.toString(array2));
    }
}
