import java.util.Scanner;

public class N_Books {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        int index = 0;
        int time= 0;
        int count = 0;

        for(int i = 0; i<n; i++){
            time += a[i];

            while (time>t){
                time -= a[index];
                index++;
            }

            count = Math.max(count, i-index+1);
        }

        System.out.println(count);
    }
}