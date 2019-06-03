package session1;
import java.util.Scanner;
public class showhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn : ");
        String name = scanner.nextLine();

        System.out.println("Hello " +name);
    }
}
