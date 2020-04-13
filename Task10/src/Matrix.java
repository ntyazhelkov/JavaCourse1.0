import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк в матрице");
        int x = scanner.nextInt();
        System.out.println("Введите количество стоблцев в матрице");
        int y = scanner.nextInt();

        int mat[][] = new int[x][y];

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
