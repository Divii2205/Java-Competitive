import java.util.*;

public class A_Young_Physicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sumx = 0, sumy = 0, sumz = 0;

        for (int i = 1; i<=n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            sumx += x;
            sumy += y;
            sumz += z;
        }

        if (sumx == 0 && sumy == 0 && sumz ==0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}