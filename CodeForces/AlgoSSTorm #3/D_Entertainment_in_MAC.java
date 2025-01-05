import java.util.Scanner;

public class D_Entertainment_in_MAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int len = s.length();

            StringBuilder flip = new StringBuilder(s);
            flip = flip.reverse();
            
            int firstG = 0;
            
            for(int i = 0; i<len/2; i++){
                if (s.charAt(i) != s.charAt(len-i-1)){
                    if(s.charAt(i) > s.charAt(len-i-1)) firstG = 1;
                    break;
                }
            }
            
            if(n%2 == 0){
                if (firstG == 1) System.out.println(flip+s);
                else System.out.println(s);
            }
            else{
                if (firstG == 1) System.out.println(flip);
                else System.out.println(s+s);
            }
        }
    }
}