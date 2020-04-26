import java.util.Scanner;

public class FinalTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара");
        double dollar = scanner.nextDouble();
        System.out.println("Введите количество рублей");
        double ruble = scanner.nextDouble();
        System.out.println(ruble + " рублей" + " = " + roundAvoid(ruble/dollar, 2) + "$");
    }
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
