import java.io.*;

public class TaskEighteen {
    public static void main(String[] args) {
        String s, str;
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\test.txt"));
             ) {
            while ((s = br2.readLine()) != null) {
                System.out.println(s);
                try (FileWriter fw = new FileWriter("C:\\Users\\user\\Documents\\test.txt")) {
                    do {
                        str = null;
                        str = br1.readLine();
                        if (str.length() == s.length()) {fw.write(str); break; }
                        else if ((str.length() > s.length()) || (str.length() < s.length())) continue;
                    } while (str.length() != s.length());
                } catch (IOException exc) {
                    System.out.println("Ошибка ввода-вывода: " + exc);
                }
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
