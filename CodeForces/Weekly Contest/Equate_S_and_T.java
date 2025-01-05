import java.util.*;
import java.lang.*;
import java.io.*;

class Equate_S_and_T
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		
		while(T-->0){
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    
		    String s = sc.next();
		    String t = sc.next();
		    
		    if (s.charAt(0) != t.charAt(0)) System.out.println("NO");
		    
		    int i = 1;
		    int j = 1;
		    
		    while(i<N && j<M){
		        if (s.charAt(i) != t.charAt(j)){
		            if (s.charAt(i) == 'b' && s.charAt(i-1) == 'a') j++;
		            else if (t.charAt(j) == 'b' && t.charAt(j-1) == 'a') i++;
		            else{
		                System.out.println("NO");
		                break;
		            }
		        } else {
		            i++;
		            j++;
		            if (i==N || j==M) System.out.println("YES");
		        }
		    }
		    
		  //  if (s.equals(t)) System.out.println("YES");
		  //  else System.out.println("NO");
		}

	}
}
