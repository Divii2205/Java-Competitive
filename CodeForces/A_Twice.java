import java.util.*;

public class A_Twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            
            if (n==1) System.out.println(0);
            else{
                Arrays.sort(a);
    
                int count = 0;
    
                for (int i = 0; i<n-1; i+=2){
                    if (a[i] == a[i+1]) count++;
                    else i--;
                }
    
                System.out.println(count);
            }
        }
    }
}