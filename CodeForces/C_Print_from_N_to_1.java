import java.util.*;
/**
 * B_Print_from_1_to_N
 */
public class C_Print_from_N_to_1 {

    static int natur(int N){
        if (N>1) {
            System.out.print (N+ " ");
            return natur (N-1);
        } else {
            System.out.println("1");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        natur(N);
    }
}