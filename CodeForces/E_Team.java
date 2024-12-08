import java.util.*;

public class E_Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i<=n; i++){
            
            int sum = 0;
            for (int j = 1; j <= 3; j++){
                int a = sc.nextInt();

                if (a==1){
                    sum += 1;
                }
            }
        if (sum>1){
            count ++;
        }
        }
        System.out.println(count);
        sc.close();
    }
}