import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] arr = {
                {1.5, 2, 3, 9.12},
                {4, 5.9, 0.11},
                {8.4, 8.6886, 2.9}
        };

        double max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong ma trận số thực là: "+max);
    }
}
