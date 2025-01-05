import java.util.*;

public class I_Mad_Triangles {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        
        // pattern 1
        for (int i = 1; i<=N; i++){
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        // pattern 2
        for (int i = 1; i<=N; i++){
            for (int k = (N-i); k>0; k--){
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        // pattern 3
        for (int i = 1; i<=N; i++){
            for (int k = (N-i); k>0; k--){
                System.out.print(" ");
            }

            for (int j = 1; j <=(2*i -1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        // pattern 4
        System.out.println("*");
        System.out.println("**");
        for (int i = 1; i<=(N-3); i++){
            System.out.print("*");
            for (int j = 1; j <=i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int j = 1; j <=N; j++){
            System.out.print("*");
        }
        
        System.out.println();
        System.out.println();

        // pattern 5
        for (int i = 1; i<N; i++){

            if (i == 1){
                for (int j = 1; j <=(N-1); j++){
                    System.out.print(" ");
                } System.out.println("*");
            } else if (i == 2){
                for (int j = 1; j <=(N-2); j++){
                    System.out.print(" ");
                } System.out.println("**");
            } else {
                for (int j =1; j <=(N-i) ; j++){
                    System.out.print(" ");
                } System.out.print("*");
                for (int j = 1; j<=(i-2); j++){
                    System.out.print(" ");
                } System.out.println("*");
            } 
        }
        for (int j = 1; j <=N; j++){
            System.out.print("*");
        }

        System.out.println();
        System.out.println();


        // pattern 6
        for (int i = 1; i<N; i++){

            if (i == 1){
                for (int j = 1; j <=(N-1); j++){
                    System.out.print(" ");
                } System.out.println("*");
            } else if (i == 2){
                for (int j = 1; j <=(N-2); j++){
                    System.out.print(" ");
                } System.out.println("* *");
            } else {
                for (int j =1; j <=(N-i) ; j++){
                    System.out.print(" ");
                } System.out.print("*");
                for (int j = 1; j <=(2*i -3); j++){
                    System.out.print(" ");
                } System.out.println("*");
            } 
        }
        for (int j = 1; j <=(2*N -1); j++){
            System.out.print("*");
        }

        System.out.println();
        
        sc.close();
    }
}