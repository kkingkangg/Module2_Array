import java.util.Scanner;
public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử hàng " + i + " cột " + j + " của mảng: ");
                int ele = sc.nextInt();
                arr[i][j] = ele;
            }
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.print("}");
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng của đường chéo trong ma trận số là: " + sum);
    }
}
