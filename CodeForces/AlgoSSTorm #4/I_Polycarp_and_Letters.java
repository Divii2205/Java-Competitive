import java.util.ArrayList;
import java.util.Scanner;

public class I_Polycarp_and_Letters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int ans = 0;
        int max = 0;
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if (list.indexOf(s.charAt(i)) == -1){
                    list.add(s.charAt(i));
                    max++;
                }
                if (i == n-1) ans = Math.max(ans, max);
            } else {
                ans = Math.max(ans, max);
                max = 0;
                list.clear();
            }
        }

        System.out.println(ans);
    }
}