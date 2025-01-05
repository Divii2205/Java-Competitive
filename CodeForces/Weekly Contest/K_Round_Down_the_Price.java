import java.util.*;

public class K_Round_Down_the_Price {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i<=t; i++){
            int m = sc.nextInt();

            if (m<10){
                System.out.println(m-1);
            } else {

                int cop = m;
                int count = 0;

                while (cop>0){
                    cop = cop/10;
                    count++;
                } 

                int num = 1;
                for (int j =1; j<count; j++){
                    num *= 10;
                }

                System.out.println(m - num);
            }
        } 
        sc.close();
    }
}