import java.util.*;

public class A_Robin_Helps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for (int i= 0; i<t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int count = 0, give =0;
            for (int j = 0; j<n; j++){
                int a = sc.nextInt();

                if (a>= k) count+=a;
                else if (a==0 && count>0){
                    count--;
                    give++;
                }
            }
            System.out.println(give);
        }
        sc.close();
    }
}