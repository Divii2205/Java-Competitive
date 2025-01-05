import java.util.Scanner;

public class E_Unit_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
            int sum = 0;
            int product = 1;

            for(int i = 0; i<n; i++){
                sum += arr[i];
                product *= arr[i];
            }

            int total = 0;

            while(sum<0 || product != 1){
                total++;
                product *= (-1);
                sum += 2;
            }

            System.out.println(total);
        }
    }
}