package session1;
import java.util.Scanner;
public class convert {
    public static void main(String[] args) {
        Scanner nhap =  new Scanner(System.in);
        System.out.println(" nhập số tiền USD cần quy đổi (dollar) : ");
        double usd = nhap.nextDouble();

        double rate = usd * 23000;
        System.out.println("giá trị tiền Việt Nam (VND) là : " +rate);
    }
}
