import java.util.Scanner;
public class subtarction {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 1st number ::");
        int num1 = sc.nextInt();

        System.out.println("Enter value of 2nd number ::");
        int num2 = sc.nextInt();


        System.out.println("Sum of the given two numbers: "+(num1-num2));
    }
}
