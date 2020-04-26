import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bin = "";
        boolean zet = false;
        do {
            System.out.println("Введите двоичное число:");
            bin = scanner.nextLine();
            for (int i = 0; i < bin.length(); i++) {
                if ((bin.charAt(i) - '0') == 1) {
                    zet = false;
                }
                else if ((bin.charAt(i) - '0') == 0 )
                    zet = false;
                else {
                    zet = true;
                    System.out.println("Ошибка ввода! Это не двоичное число");
                    break;
                }
            }
        }
        while(zet);
        int n = 0;
        for (int i = bin.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n += (bin.charAt(i) - '0') * j;
        }
        System.out.print(n);
    }
}
