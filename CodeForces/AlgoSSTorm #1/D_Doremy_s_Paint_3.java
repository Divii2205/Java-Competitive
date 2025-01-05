import java.util.ArrayList;
import java.util.Scanner;

public class D_Doremy_s_Paint_3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

            ArrayList<Integer> elem = new ArrayList<>();
            ArrayList<Integer> freq = new ArrayList<>();

            for(int i = 0; i<n; i++){
                if(elem.indexOf(arr[i]) == -1){
                    elem.add(arr[i]);
                    freq.add(1);
                }
                else{
                    int num = elem.indexOf(arr[i]);
                    int value = freq.get(num);
                    freq.set(num, ++value);
                }
            }

            if(elem.size() > 2) System.out.println("No");
            else if(elem.size() == 1) System.out.println("Yes");
            else{
                int one = freq.get(0);
                int two = freq.get(1);

                if(Math.abs(one-two) > 1) System.out.println("No");
                else System.out.println("Yes");
            }
        }
    }
}