import java.util.*;
/**
 * A_Print_Recursion
 */
public class A_Print_Recursion {

    static int printRec(int N){
        if (N!=0) {
            System.out.println("I love Recursion");
            return printRec(N-1);
        } else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        printRec(N);
    }
}