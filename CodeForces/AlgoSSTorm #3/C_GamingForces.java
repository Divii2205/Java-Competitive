import java.util.Scanner;

public class C_GamingForces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i<n; i++) a[i] = sc.nextInt();

            int sum = 0;
            for(int i = 0; i<n; i++) sum += a[i];

            if (sum == n) System.out.println((n+1)/2);
            else{
                int one = 0;
                for(int i = 0; i<n; i++){
                    if (a[i] == 1) one++;
                }
                int ans = n - (one/2);
                System.out.println(ans);
            }
        }
    }
}