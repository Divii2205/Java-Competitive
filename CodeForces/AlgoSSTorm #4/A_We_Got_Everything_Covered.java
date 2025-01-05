import java.util.Scanner;

public class A_We_Got_Everything_Covered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
    
            char alph = 'a';
            StringBuilder s = new StringBuilder();
            StringBuilder ans = new StringBuilder(); 

            for(int i = 0; i<k; i++){
                s.append(alph);
                alph++;
            }

            for(int i = 0; i<n; i++) ans.append(s);
            
            System.out.println(ans.toString());
        }
    }
}