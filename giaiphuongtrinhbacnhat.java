package session1;
import java.util.Scanner;
public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {

        System.out.println("giải phương trình bậc nhất");
        System.out.println("Đưa ra một phương trình là 'a * x + b = 0', vui lòng nhập các hằng số:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();


        if (a != 0) {
            double answer = - b / a;
            System.out.printf("có nghiệm x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("phương trình có vô số nghiệm");
            } else {
                System.out.print("không có nghiệm!");
            }
        }

    }
}
