package session1;

import java.util.Scanner;

public class Showsonguyento {
    public static void main(String[] args) {

        System.out.println("Hiển Thị các số nguyên tố nhỏ hơn 100");
        int sum = 0,cout = 0;
        for ( int j = 2 ; j < 100 ;j++ ) {
            for (int i=1; i <= j ; i++){
                if(j % i == 0)
                    cout ++;
            }
            if (cout == 2 && j < 100 ) System.out.println(j);
            cout = 0;
        }
    }
}
