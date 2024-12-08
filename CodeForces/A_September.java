import java.util.*;
public class A_September {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 1; i<=12; i++){
            String n = sc.nextLine();
            if (n.length()==i) count++;
        }

        System.out.println(count);
    }
}