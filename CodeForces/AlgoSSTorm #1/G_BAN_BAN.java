import java.util.Scanner;

public class G_BAN_BAN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int count = (n+1)/2;
            System.out.println(count);

            if (n==1) System.out.println(1 + " " + 2);
            if (n==2) System.out.println(2 + " " + 6);

            else{
                int num = count;
                int one = 2;
                int two = 6;
                
                for(int i = 0; i<count-1; i++){
                    System.out.println(one + " " + two);
                    one = two+2;
                    two = one+4;
                }

                if(num!=1){
                    if(n%2==0){
                        System.out.println(one + " " + two);
                    } else {
                        one--;
                        two = one+1;
                        System.out.println(one + " " + two);
                    }
                }
            }
        }
    }
}