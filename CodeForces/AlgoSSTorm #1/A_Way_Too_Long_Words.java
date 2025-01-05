import java.util.Scanner;

public class A_Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            String str = sc.next();
            int len = str.length();

            if (len<=10) System.out.println(str);
            else{
                String ans = str.charAt(0) + Integer.toString(len-2) + str.charAt(len-1);
                System.out.println(ans);
            }
        }
    }
}