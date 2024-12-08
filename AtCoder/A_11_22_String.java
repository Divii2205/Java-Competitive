import java.util.*;

public class A_11_22_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        if (N%2 == 0) System.out.println("No");
        else{
            if (N==1 && S.charAt(0) == '/') System.out.println("Yes");
            else {
                int oneC = 0;
                int twoC = 0;
    
                for (int i = 0; i<N; i++){
                    if (i<N/2 && S.charAt(i) == '1') oneC++;
                    else if ((i>N/2 && i<N) && S.charAt(i) == '2') twoC++;
                }
    
                if (S.charAt(N/2) != '/' || oneC != N/2 || twoC != N/2) System.out.println("No");
                else System.out.println("Yes");
            }
        }
    }
}