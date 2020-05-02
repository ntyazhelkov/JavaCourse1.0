import java.io.*;

public class TaskEighteen {
    public static void main(String[] args) {
        String s, str;
        int i = 0, j = 0;
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\test.txt"));
             ) {
           while ((s = br2.readLine()) != null) {
                System.out.println(s);
                i++;
            }


            try (FileWriter fw = new FileWriter("C:\\Users\\user\\Documents\\test.txt")) {
                while (j < i) {
                    str = br1.readLine();
                    fw.write(str + "\n");
                    j++;
                }
            } catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода: " + exc);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }


    }
}
