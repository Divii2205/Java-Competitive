import java.util.*;

public class D_Three_Indices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i<n; i++) a[i] = sc.nextInt();

            boolean found = false;
            for(int i = 1; i<n-1; i++){
                if(a[i-1] < a[i] && a[i]>a[i+1]){
                    found = true;
                    System.out.println("YES");
                    System.out.println((i) + " " + (i+1) + " " + (i+2));
                    break;
                }
            }

            if(!found) System.out.println("NO");
        }
    }
}