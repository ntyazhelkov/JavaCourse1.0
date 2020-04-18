import java.util.Scanner;

public class CustomVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String S = scanner.nextLine();
        int X = Integer.parseInt(S);
        double Y = (double)X;

        System.out.println(S + '\n' + X + '\n' + Y);
    }
}
