import java.util.Scanner;
public class CountElementsOfString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = input.nextLine();
        System.out.println("Nhập ký tự muốn đếm trong chuỗi: ");
        String chara  = input.nextLine();


        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (chara.equalsIgnoreCase(String.valueOf(str.charAt(i)))) {
                k++;
            }
        }
        System.out.println("Ký tự " + chara + " xuất hiện "+ k +" lần trong chuỗi");


    }
}
