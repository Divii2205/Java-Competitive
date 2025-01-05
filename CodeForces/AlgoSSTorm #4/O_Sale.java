import java.util.Arrays;
import java.util.Scanner;

public class O_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        Arrays.sort(a);

        int count = 0;
        int sum = 0;

        for(int i = 0; i<n; i++){
            if(a[i]<0 && count < m){
                sum += a[i];
                count++;
            }
            else break;
        }
        
        System.out.println(sum * -1);
    }
}