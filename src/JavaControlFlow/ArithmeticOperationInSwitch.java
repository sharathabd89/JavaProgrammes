package JavaControlFlow;

import java.util.Scanner;

public class ArithmeticOperationInSwitch {
    public static void main(String[] args) {
        Scanner sinput = new Scanner(System.in);

        System.out.println("Please enter the number A:");
        int number1 = sinput.nextInt();

        System.out.println("Please enter the number B:");
        int number2 = sinput.nextInt();

        System.out.println("Please enter the arithmetic symbol (+, -, *, /):");
        String ch = sinput.next();

        switch (ch) {
            case "+":
                int sum = number1 + number2;
                System.out.println("Addition of two numbers is = " + sum);
                break;

            case "-":
                int sub = number1 - number2;
                System.out.println("Subtraction of two numbers is = " + sub);
                break;

            case "*":
                int mul = number1 * number2;
                System.out.println("Multiplication of two numbers is = " + mul);
                break;

            case "/":
                if (number2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    double div = (double) number1 / number2;
                    System.out.println("Division of two numbers is = " + div);
                }
                break;

            default:
                System.out.println("Not a valid symbol to perform arithmetic operation.");
        }
    }}
