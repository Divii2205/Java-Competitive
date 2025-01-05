import java.util.*;
import java.lang.*;
import java.io.*;

class Elections
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner (System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i<T; i++){
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            int[] A = new int[N];
            int[] B = new int[N];
            
            for (int j = 0; j<N; j++) A[j] = sc.nextInt();
            for (int j = 0; j<N; j++) B[j] = sc.nextInt();
            
            int count = 0;
            
            ArrayList<Integer> ans = new ArrayList<Integer>();

            for (int j = 0; j<N; j++){
                if (A[j] > B[j]) count++;
                else ans.add(B[j] - A[j] + 1);
            }
            Collections.sort(ans);

            for (int j = 0; j<ans.size(); j++){
                if (X >= ans.get(j)){
                    X = X - ans.get(j);
                    count++;
                }
            }
            
            if (count > N/2) System.out.println("YES");
            else System.out.println("NO");
        }
	}
}