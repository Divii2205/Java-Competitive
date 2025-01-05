import java.util.Scanner;

public class E_Desorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
            
            boolean inc = true;
            for(int i = 0; i<n-1; i++){
                if(arr[i]>arr[i+1]){
                    inc = false;
                    break;
                }
            }

            if(!inc) System.out.println(0);
            else{
                
                int min = Integer.MAX_VALUE;
                for(int i = 0; i<n-1; i++){
                    min = Math.min(min, arr[i+1]-arr[i]);
                }
                System.out.println((min / 2)+1);
            }
        }
    }   
}