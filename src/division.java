

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        if (num2 != 0) {
            System.out.println("The result of division is: " + ((double) num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

