import java.util.*;

/**
 * C_Max_Ai_Bj
 */
public class C_Max_Ai_Bj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for (int i = 0; i<N; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i<N; i++) arr2[i] = sc.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1[N-1] + arr2[N-1]);
    }
}