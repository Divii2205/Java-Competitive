import java.util.*;
public class Z_Hard_Compare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        long B = sc.nextInt();
        double C = sc.nextInt();
        long D = sc.nextInt();

        if (Math.pow(A,B) > Math.pow(C, D)) System.out.println("YES");
        else System.out.println("NO");

        sc.close();
    }
}