import java.util.Scanner;

public class JavaProjectQ4 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int number2 = input.nextInt();
        System.out.println("Sum= " + (number1 + number2));
        System.out.println("Difference= " + (number1 - number2));
        System.out.println("Product= " + number1*number2);
        System.out.println("Division= " + number1/number2);
    }
}
