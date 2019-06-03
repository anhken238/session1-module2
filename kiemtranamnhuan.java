package session1;
import java.util.Scanner;
public class kiemtranamnhuan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm :");
        int year = scanner.nextInt();

        if(year % 4 ==0){
            if(year % 100 ==0) {
                if (year % 400 == 0) {
                    System.out.println(year + " là năm nhuận");
                }
                else {
                    System.out.println(year + " không phải năm nhuận");
                }
            }
            else{
                    System.out.println(year + " là năm nhuận");
                }
            }
        else{
                System.out.println(year + " không phải năm nhuận");
            }
        }
    }

