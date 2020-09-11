import java.util.Scanner;
public class FindMin {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int min = minValue(arr);
        System.out.println("The smallest element in the array is: " + min);
    }

    public static int minValue(int[] array) {
        int minA = array[0];
        for (int i = 0; i < array.length; i++) {
                if ( array[i] < minA) {
                    minA = array[i];
            }
        }
        return minA;
    }
}
