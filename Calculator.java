import java.util.Scanner;

public class Calculator {

    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result;
        char operator;
        int n =1;
        while (n==1) {


            System.out.println("-------------------------------");
            System.out.print("Enter first number: "); // input first number
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: "); // input second number
            double num2 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): "); // choose operation
            operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operator!");
                    return;
            }

            System.out.println("\nRESULT:\n"+num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println("\nDO YOu Want To Perform Again?? (Press 1 ,if yes)");
            n=scanner.nextInt();
            
        }
    }
}
