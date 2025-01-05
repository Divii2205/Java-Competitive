import java.util.*;

public class B_Basic_Data_Types {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        long num2 = sc.nextLong();
        String str = sc.next();
        float num3 = sc.nextFloat();
        double num4 = sc.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str);
        System.out.println(num3);
        System.out.println(num4);

        sc.close();
    }
}