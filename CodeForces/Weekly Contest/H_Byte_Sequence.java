import java.util.*;

public class H_Byte_Sequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i<t; i++){
            int n = sc.nextInt();

            if (n==2) System.out.println("2 2");
            else{
                if (n%2==0){
                    for (int j = 0; j<n-2; j++) System.out.print(1 + " ");
                    System.out.println(2 + " " + n);
                }
                else {
                    for (int j = 0; j<n-3; j++) System.out.print(1 + " ");
                    System.out.println(2 + " " + 1 + " " + n);
                }
            }
        }
    }
}