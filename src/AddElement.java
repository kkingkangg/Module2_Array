import java.util.Scanner;
public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,9,6,5,8,4,0,0,0};
        System.out.println("Cho trước mảng: Array = {1,2,9,6,5,8,4,0,0,0};");
        System.out.print("Chọn vị trí muốn add zô: ");
        int index = sc.nextInt();
        System.out.print("Bạn muốn thêm số nào: ");
        int num = sc.nextInt();

        int[] newArr = new int[10];
        if(index<=1 || index> arr.length-1){
            System.out.println("Không thể add");
        } else {
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            for (int j = index; j < arr.length; j++){
                newArr[j] = arr[j-1];
            }
            newArr[index] = num;
        }

        System.out.print("Mảng sau khi chèn " + index + " là: ");
        for(int x:newArr) {
            System.out.print(x + ",");
        }

    }
}
