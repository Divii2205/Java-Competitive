import java.util.*;

/**
 * B_1_D_Keyboard
 */
public class B_1_D_Keyboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String alph = sc.nextLine();

        int count = 0;
        for (int i = 0; i< 26; i++){
            int ch = alph.charAt(i);
            count = count + (ch-66);
        }
        System.out.println(count);
    }
}