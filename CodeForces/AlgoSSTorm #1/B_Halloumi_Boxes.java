import java.util.Scanner;

public class B_Halloumi_Boxes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

            if(k == 1){
                boolean flag = true;
                for(int i = 0; i<n-1; i++){
                    if(arr[i]>arr[i+1]){
                        flag = false;
                        break;
                    }
                }
                if (flag) System.out.println("YES");
                else System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}