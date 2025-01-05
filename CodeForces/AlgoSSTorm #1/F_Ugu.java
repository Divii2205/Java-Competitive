
import java.util.Scanner;

public class F_Ugu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            String s = sc.next();

            if(n == 1) System.out.println(0);
            else{
                int len = s.length();
                int indexOne = -1;
    
                for(int i = 0; i<len; i++){
                    if(s.charAt(i) == '1'){
                        indexOne = i;
                        break;
                    }
                }
                
                if(indexOne == -1) System.out.println(0);
                else {
                    int count = 0;
                    for(int i = indexOne; i<len-1; i++){
                        if(s.charAt(i) != s.charAt(i+1)) count++;
                    }
                    System.out.println(count);
                }
            }
        }
    }
}