import java.util.*;

/**
 * Y_The_last_2_digits
 */
public class Y_The_last_2_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        A = A%100;

        long B = sc.nextLong();
        B = B%100;

        long C = sc.nextLong();
        C = C%100;

        long D = sc.nextLong();
        D = D%100;


        long product = A*B*C*D;

        product = product%100;

        if (product<10) System.out.print(0);
        System.out.println(product);

        sc.close();
    }
}