import java.util.*;

public class B_Nearly_Lucky_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long count = 0;

        while (n>0){
            long mod = n%10;
            n = n/10;

            if (mod == 4 || mod == 7){
                count ++;
            }
        }

        if (count == 4 || count == 7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }    
}
