import java.util.Scanner;
public class FindElement {
    public static void main(String[] args) {
        String [] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i<student.length; i++) {
            if (student[i].equals(name)) {
                System.out.println("Học sinh " + name + " số thứ tự thứ " + (i+1));
                isExist = true;
            }
        }
        if(!isExist) {
            System.out.println("Không có học sinh này nhó");
        }
    }
}
