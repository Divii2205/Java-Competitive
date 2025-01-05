import java.util.*;

public class A_Alice_s_Adventures_in_Chess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();

            int[] arr = new int[2];

            boolean found = false;

            int count = 0;
            for(int j =0;j<100;j++){

                for (int i = 0; i<n; i++){
                    char moves = s.charAt(i);
                    if(moves=='N') arr[1]++;
                    if(moves=='S') arr[1]--;
                    if(moves=='E') arr[0]++;
                    if(moves=='W') arr[0]--;
                    if( arr[0]== a && arr[1]== b) {
                       found = true;
                       break;
                    }
                    // if (i == n-1) i = -1;
                    // count++;
    
                    // if (count > n*10) break;
                }
            }
            if (!found) System.out.println("NO");
            else System.out.println("YES"); 
        }
    }    
}