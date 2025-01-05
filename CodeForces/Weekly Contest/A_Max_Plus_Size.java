import java.util.*;

public class A_Max_Plus_Size {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i =0; i<t; i++){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j<n; j++) arr[j] = sc.nextInt();
            
            // if (n%2 != 0){
            //     int max = arr[0];
            //     for (int j =0; j<n; j+=2){
            //         if (arr[j]>max) max = arr[j];
            //     }
            //     System.out.println((n+1)/2 + max);
            // }

            // else {
            //     Arrays.sort(arr);
            //     System.out.println(n/2 + arr[n-1]);
            // }

            int max1 = 0;
            int count1 = 0;

            for (int j = 0; j<n; j+=2){
                if (arr[j] > max1) max1 = arr[j];
                count1++;
            }

            int max2 = 0;
            int count2 = 0;

            for (int j = 1; j<n; j+=2){
                if (arr[j] > max2) max2 = arr[j];
                count2++;
            }

            if (max1+count1 >= max2+count2) System.out.println(max1+count1);
            else System.out.println(max2+count2);
        }
    }
}

