import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select a language:");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Urdu");
        System.out.print("Enter choice: ");

        int choice = input.nextInt();

        Locale locale;

        switch (choice) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("ur", "PK");
                break;
            default:
                locale = new Locale("en", "US");
        }

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);

        System.out.println(rb.getString("wish"));
        System.out.print(rb.getString("prompt1") + " ");
        double a = input.nextDouble();
        System.out.print(rb.getString("prompt2") + " ");
        double b = input.nextDouble();
        double sum = addMe(a, b);
        double subtract = subMe(a, b);
        System.out.println(rb.getString("summa") + " " + sum);
        System.out.println(rb.getString("subtract") + " " + subtract);

        input.close();
    }

    public static double addMe(double a, double b) {
        return a + b;
    }

    public static double subMe(double a, double b) {
        return a - b;
    }
}