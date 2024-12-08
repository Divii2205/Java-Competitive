import java.util.*;

public class B_Robin_Hood_and_the_Major_Oak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        for (int i = 0; i<t; i++){
            long n = sc.nextLong();
            long k = sc.nextLong();

            long leaves = 0;

            leaves = (n*(n+1))/2;
            leaves -= ((n-k)*(n-k+1))/2;  
            
            if (leaves%2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}