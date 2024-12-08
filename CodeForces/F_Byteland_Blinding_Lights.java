import java.util.*;

public class F_Byteland_Blinding_Lights {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            int n = sc.nextInt();

            int[][] A = new int[n][2];

            for (int j = 0; j<n; j++){
                for (int k = 0; k<2; k++) A[j][k] = sc.nextInt();
            }

            boolean flag = false;
            
            ArrayList<Integer> list = new ArrayList<Integer>();
            int index = 0;
            while (b>=0){
                for (int j = 0; j<n; j++){
                    if (A[j][0]*b - a*b + a*A[j][1] == 0){
                        list.add(A[j][0]);
                        Collections.sort(list);
                        if (A[j][0]<=list.get(0)) index = j;
                        flag = true;
                    }
                }
                a += v1;
                b -= v2;
            }

            if (!flag) System.out.println(-1);
            else System.out.println(index+1);
        }
    }
}