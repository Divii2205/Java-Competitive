import java.util.*;

public class E_Binary_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i<t; i++){
            int n = sc.nextInt();

            String s = sc.next();

            if (s.charAt(0) == s.charAt(n-1)) System.out.println(0);
            else if (s.charAt(1) == '1' && s.charAt(n-2) == '1') System.out.println(2);
            else System.out.println(1);
        }
    }
}