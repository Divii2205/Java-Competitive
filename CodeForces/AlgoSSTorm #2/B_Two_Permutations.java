import java.util.Scanner;

public class B_Two_Permutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (n == 1) System.out.println("Yes");
            else if (n == 2 || n == 3) System.out.println("No");
            else{
                if (a+b <= n) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}