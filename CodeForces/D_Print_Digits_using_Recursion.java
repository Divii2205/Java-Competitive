import java.util.*;

/**
 * D_Print_Digits_using_Recursion
 */
public class D_Print_Digits_using_Recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i<t; i++){
            int n = sc.nextInt();
            if (n==0) System.out.println(0);
            else{
                int total = zeroes(n);
                int rev = seperate(n, 0);
                print(rev);

                while (total-->0) System.out.print(0 + " ");
                System.out.println();
            }
        }
    }

    static int seperate(int n, int rev){
        if (n==0) return rev;
        rev = (rev*10) + n%10;
        n = n/10;
        return seperate(n, rev);
    }

    static int print(int n){
        if (n==0) return 0;
        System.out.print(n%10 + " ");
        return print(n/10);
    }

    static int zeroes(int n){
        int count = 0;
        while (n%10 == 0){
            count++;
            n /= 10;
        }
        return count;
    }
}