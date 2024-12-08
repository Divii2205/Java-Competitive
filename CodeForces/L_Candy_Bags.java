import java.util.*;

public class L_Candy_Bags {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sq = n*n;
        for (int i = 1; i<=sq/2; i++){
            System.out.print(i+" ");
            System.out.println(sq -i +1);
        }
        sc.close();
    }    
}