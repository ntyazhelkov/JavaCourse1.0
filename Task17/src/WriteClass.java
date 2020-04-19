import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteClass {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для окончания ввода введите 'stop' ");

        try (FileWriter fw = new FileWriter("C:\\Users\\user\\Documents\\test.txt", true)) {
            do {
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;;
                    fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
