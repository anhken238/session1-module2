package session1;

public class haimuoisonguyento {
    public static void main(String[] args) {
        System.out.println("Hiển thị 20 số nguyên tố đầu tiên");
        int cout  = 0, i;
        for(i=0; ; i++){
           if (isPrimeNumber(i) && cout < 20){
               System.out.println(i);
               cout = cout +1;
           }
        }
    }

public  static boolean isPrimeNumber(int n ){
    if (n < 2) {
        return false;
    }
    int squareRoot = (int) Math.sqrt(n);
    for (int i = 2; i <= squareRoot; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

}
