import java.util.*;
/**
 * B_Print_from_1_to_N
 */
public class B_Print_from_1_to_N {

    static int natur(int N){
        if (N>0) {
            natur (N-1);
            System.out.println(N);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        natur(N);
    }
}