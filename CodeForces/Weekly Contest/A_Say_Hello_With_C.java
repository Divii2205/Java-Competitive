import java.util.*;
public class A_Say_Hello_With_C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Hello, " + name);
        sc.close();
    }
}