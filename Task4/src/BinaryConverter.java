import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двоичное число:");
        //Вводим в бинарном формате в сторокову переменную,
        // так как тип byte ограничен вариантами ввода десятичных значений
        String bin = scanner.nextLine();
        int i = Integer.parseInt(bin, 2);
        System.out.println("В десятичном формате: ");
        System.out.println(i);

    }
}
