import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int mat[][] = new int[3][4];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
            for(int j = 0; j < 4; j++){
                System.out.println(mat[0][j]*3);
            }
    }
}
