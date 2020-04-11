import java.util.Scanner;

public class ConstCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = 10;
        int Y = 15;
        int Z = 35;
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
