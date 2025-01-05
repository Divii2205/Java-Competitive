import java.util.Scanner;

public class C_Beautiful_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[5][5];

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++) matrix[i][j] = sc.nextInt();
        }

        int indexI = 0;
        int indexJ = 0;

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                if (matrix[i][j] == 1){
                    indexI = i;
                    indexJ = j;
                    break;
                }
            }
        }

        int count = Math.abs(indexI-2) + Math.abs(indexJ-2);
        System.out.println(count);
    }
}