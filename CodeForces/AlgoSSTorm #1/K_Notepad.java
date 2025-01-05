import java.util.Scanner;

public class K_Notepad {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            String s = sc.next();

            if(n == 1) System.out.println("NO");
            else{
                int count = 0;
                String word = "";
                String sub = "";
    
                for(int i = 0; i<s.length(); i++){
                    sub += s.charAt(i);
    
                    if(!word.contains(sub)){
                        word += sub;
                        count += sub.length();
                        sub = "";
                    }
                }
    
                if(count<n) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}