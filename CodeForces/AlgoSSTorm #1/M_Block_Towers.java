import java.util.Arrays;
import java.util.Scanner;

public class M_Block_Towers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

            int tower = arr[0];
            Arrays.sort(arr);
            
            for(int i = 0; i<n; i++){
                if(arr[i]>tower){
                    int diff = ((arr[i] - tower) + 1)/2;
                    tower += diff;
                }
            }

            System.out.println(tower);
        }
    }
}