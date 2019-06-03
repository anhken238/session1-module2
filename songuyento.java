package session1;
import java.util.Scanner;
public class songuyento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();

        if(number < 2) {
            System.out.println("Đây không phải số nguyên tố");
        }
        else{
             int i = 2;
             boolean check = true;
             while(i <= Math.sqrt(number)){
                 if(number % 2 == 0){
                     check = false;
                     break;
                 }
                 i++;
            }
             if(check)
                 System.out.println(+number +" là số nguyên tố");
             else
                 System.out.println(+number +"  không phải là số nguyên tố");
        }

    }
}
