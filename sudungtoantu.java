package session1;
import java.util.Scanner;

public class sudungtoantu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập Chiều rộng : ");
        width = scanner.nextFloat();

        System.out.println("nhập chiều dài: ");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println("Diện tích hình chữ nhật: " +area);
    }
}

