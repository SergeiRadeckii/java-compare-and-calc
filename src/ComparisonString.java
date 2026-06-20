import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparisonString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку a: ");
        String a = bufferedReader.readLine();

        System.out.println("Введите строку b: ");
        String b = bufferedReader.readLine();

        if (a.equals(b)) {
            System.out.println("Строки индетичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
