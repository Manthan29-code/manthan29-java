import java.util.Scanner;

public class UserInputEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // double input
        System.out.print("Enter a double: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        //  string input
        scanner.nextLine(); // consume the leftover newline
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("You entered: " + text);

        scanner.close();
    }
}
