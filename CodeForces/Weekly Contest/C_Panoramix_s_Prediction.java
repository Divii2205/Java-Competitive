import java.util.*;

public class C_Panoramix_s_Prediction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int nextPrime = 0;
        for (int i = n+1; i < 50; i++){
            
            int count = 0;
            for (int j = 1; j<=i; j++){
                if (i%j == 0){
                    count ++;
                }
            }

            if (count == 2){
                nextPrime = i; 
                break;
            } 
        }

        if (nextPrime == m){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}