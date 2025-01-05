import java.util.Scanner;

public class B_Make_it_Beautiful {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i<n; i++) a[i] = sc.nextInt();

            boolean same = true;
            for(int i = 0; i<n-1; i++){
                if(a[i] != a[i+1]){
                    same = false;
                    break;
                }
            }

            if(same) System.out.println("NO");
            else{
                System.out.println("YES");
                
                for(int i = 0; i<n/2; i++){
                    int temp = a[i];
                    a[i] = a[n-i-1];
                    a[n-i-1] = temp;
                }
                
                if(a[0] == a[1]){
                    int temp = a[0];
                    a[0] = a[n-1];
                    a[n-1] = temp;
                }
    
                for(int i = 0; i<n; i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
    }
}