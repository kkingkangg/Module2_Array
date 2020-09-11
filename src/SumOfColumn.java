import java.util.Scanner;
public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = {
                {1.5, 2, 3, 9.12},
                {4, 5.9, 0.11, 8.988},
                {8.4, 8.6886, 2.9, 6.886}
        };
        System.out.println("Cột mà bạn muốn tính tổng: ");
        int col = sc.nextInt();
        double sum = 0;
        if (col<0 || col>arr[0].length){
            System.out.println("Không có cột này trong ma trận số");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (col == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng của cột " + col + " là: " + sum);
    }
}
