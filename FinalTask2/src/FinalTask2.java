import java.util.Scanner;

public class FinalTask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int y = scanner.nextInt();
        int[] arr = new int[y];
        System.out.println("Введите массив");
        for(int i = 0; i < y; i++) {
            arr[i] = scanner.nextInt();
        }
        insertIntoSort(arr);
    }

    public static void insertIntoSort(int[] arr) {
        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }
}
