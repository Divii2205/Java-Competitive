import java.util.Arrays;
import java.util.Scanner;

public class E_Median_of_an_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i<n; i++) a[i] = sc.nextInt();

            Arrays.sort(a);

            int count = 1;
            
            for (int i = (n-1)/2; i < n-1; i++) {
                if(a[i] == a[i+1]) count++;
                else break;
            }

            System.out.println(count); 
        }
    }
}