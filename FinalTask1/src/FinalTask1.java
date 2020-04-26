import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двоичное число:");
        String bin = scanner.nextLine();
        int n = 0;
        for (int i = bin.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n += (bin.charAt(i) - '0') * j;
        }
        System.out.print(n);
    }
}
