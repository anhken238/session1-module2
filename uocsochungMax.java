package session1;
import java.util.Scanner;
public class uocsochungMax {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println(("Nhập b: "));
        int b = scanner.nextInt();

        Math.abs(a);
        Math.abs(b);

        if(a == 0 || b == 0){
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("ước số chung lớn nhất là : " + a);
    }
}
