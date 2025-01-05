import java.util.Scanner;

public class K_The_Eternal_Immortality {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (b-a >= 5) System.out.println(0);
        else{
            long prod = 1;

            for(long i = a+1; i<=b; i++){
                prod *= i;
                prod = prod%10;
            }

            System.out.println(prod);
        }
     }
}