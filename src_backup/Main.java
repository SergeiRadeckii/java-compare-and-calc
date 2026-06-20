import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число а:");
        int a = scanner.nextInt();

        System.out.println("Введите целое число b:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сумма : " + (a + b));
        System.out.println("Разность : " + (a - b));
        System.out.println("Умножение : " + (a * b));
        System.out.println("Делениев : " + (a / b));

        scanner.close();
    }
}