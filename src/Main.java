import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^(?:(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$";

        System.out.println("Введите IPv4 адрес и программа скажет, является ли он валидным.");

        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (true) {
            System.out.print("> ");
            userInput = scanner.nextLine();
            if (Pattern.matches(regex, userInput))
                System.out.println("Был введён валидный IPv4 адрес!");
            else
                System.out.println("Неверный IPv4 адрес...");
        }
    }
}