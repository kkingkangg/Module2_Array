import java.util.Scanner;
public class IncludedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " trong mảng arr1: ");
            int element = sc.nextInt();
            arr1[i] = element;
        }

        int[] arr2 = new int[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " trong mảng arr2: ");
            int element = sc.nextInt();
            arr2[i] = element;
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0, j=0, k=1; i < arr1.length; i++, j+=2, k+=2) {
            arr3[j] = arr1[i];
            arr3[k] = arr2[i];
        }

        System.out.print("Sau khi gộp 2 mảng arr1 và arr2 được mảng arr3: ");
        for(int x:arr3) {
            System.out.print(x + ",");
        }
    }
}
