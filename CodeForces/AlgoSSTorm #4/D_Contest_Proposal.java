import java.util.Scanner;

public class D_Contest_Proposal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            for(int i = 0; i<n; i++) b[i] = sc.nextInt();

            int count = 0;

            int aCount = 0;

            for(int i = 0; i<n; i++){
                if (a[aCount] > b[i]) count++;
                else aCount++;                
            }

            System.out.println(count);
        }
    }
}