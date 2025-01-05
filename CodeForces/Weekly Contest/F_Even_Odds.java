import java.util.*;

public class F_Even_Odds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        long knew = 0;

        if (n%2 != 0) {
            knew = (n+1)/2;
        } else {
            knew = n/2;
        }


        if (k>knew){
            k = k - knew;
            System.out.println(2*k);
        } else{
            System.out.println(1 + 2*(k-1));
        }

    sc.close();
    }
}