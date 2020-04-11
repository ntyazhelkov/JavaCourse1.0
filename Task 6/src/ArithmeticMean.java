import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x = scanner.nextInt();
        System.out.println("Введите второе число:");
        int y = scanner.nextInt();
        System.out.println("Введите третье число:");
        int z = scanner.nextInt();

        if (((x+y+z)/3)/2 > 3) {
            System.out.println("Программа работает корректно");
        }
    }
}
