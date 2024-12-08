import java.util.*;

public class D_I_love_username {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();

        int max = a;
        int min = a;
        int count = 0;

        for (int i = 1; i<n; i++){
            int x = sc.nextInt();

            if (x > max){
                max = x;
                count ++;
            } else if (x < min){
                min = x;
                count ++;
            }
        }
        System.out.println(count);
        sc.close();
    }    
}