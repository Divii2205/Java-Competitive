import java.util.*;

public class E_Sasha_and_the_Beautiful_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i<n; i++) a[i] = sc.nextInt();

            Arrays.sort(a);

            System.out.println(a[n-1] - a[0]);
        }
    }
}