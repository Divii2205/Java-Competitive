import java.util.Scanner;

public class A_Goals_of_Victory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int[] a = new int[n-1];

            for(int i = 0; i<n-1; i++) a[i] = sc.nextInt();

            int total = 0;

            for(int i = 0; i<n-1; i++) total = a[i] + total;

            System.out.println(0 - total);
        }
    }
}