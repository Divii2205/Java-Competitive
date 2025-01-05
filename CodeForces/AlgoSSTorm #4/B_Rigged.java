import java.util.Scanner;

public class B_Rigged {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i<n; i++){
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }

            int s1 = a[0];
            int e1 = b[0];
            boolean flag = true;

            for(int i = 1; i<n; i++){
                if(a[i] >= s1 && b[i] >= e1){
                    flag = false;
                    System.out.println(-1);
                    break;
                }
            }

            if(flag) System.out.println(s1);
        }
    }
}