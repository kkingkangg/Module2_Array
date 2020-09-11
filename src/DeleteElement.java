import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,9,6,5,8,4};
        System.out.println("Nhap so can xoa");
        int x = input.nextInt();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
            }
        }

        System.out.println("vi tri can xoa so la " + index);

        for (int j = index; j < arr.length-1; j++) {
            arr[j] = arr[j+1];
            arr[arr.length-1] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
