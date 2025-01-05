import java.util.*;

public class H_Five_Layers_of_Patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 1; i<=N; i++){
            for (int j = 1; j<=M; j++){
                System.out.print("*");
            } 
            System.out.println();
        }

        System.out.println();

        char letter = 'A';
        for (int i = 1; i<=N; i++){
            for (int j = 1; j<=M; j++){
                System.out.print(letter);
            } 
            letter += 1;
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i<=N; i++){
            letter = 'A';
            for (int j = 1; j<=M; j++){
                System.out.print(letter);
                letter += 1;
            } 
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i<=N; i++){
            for (int j = 1; j<=M; j++){
                System.out.print(i);
            } 
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i<=N; i++){
            for (int j = 1; j<=M; j++){
                System.out.print(j);
            } 
            System.out.println();
        }
        sc.close();
    }
}