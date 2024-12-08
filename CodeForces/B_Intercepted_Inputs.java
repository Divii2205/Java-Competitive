import java.util.*;
public class B_Intercepted_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int k = sc.nextInt();

            int[] a = new int[k];

            for (int i = 0; i<k; i++) a[i] = sc.nextInt();

            int target = k-2;

            Arrays.sort(a);
            boolean flag = false;

            for (int i = 0; i<k; i++){
                for (int j = i+1; j<k; j++){
                    if (a[i]*a[j] == target){
                        System.out.println(a[i] + " " + a[j]);
                        flag = true;
                        break;
                    }
                    if (a[i]*a[k-1-j] == target){
                        System.out.println(a[i] + " " + a[k-1-j]);
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }
        }
    }
}