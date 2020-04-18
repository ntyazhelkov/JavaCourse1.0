import java.util.Scanner;

public class MinusSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String strSpace = str.replaceAll("\\s","");
        System.out.print(strSpace);
    }
}
