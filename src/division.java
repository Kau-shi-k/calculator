import java.util.Scanner;

public class division {

    public static double divideNumbers(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        try {
            double result = divideNumbers(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
