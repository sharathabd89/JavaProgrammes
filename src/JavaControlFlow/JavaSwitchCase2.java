package JavaControlFlow;

import java.util.Scanner;

public class JavaSwitchCase2 {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.println("Please provide your score (0-100): ");
        int input = takeInput.nextInt();

        // Check for invalid input
        if (input < 0 || input > 100)


        {
            System.out.println("Invalid score! Please enter a score between 0 and 100.");
        } else {
            System.out.println("Your grade is:");

            switch (input / 10) {
                case 10: // For scores exactly 100
                case 9:
                    System.out.println('A');
                    break;
                case 8:
                    System.out.println('B');
                    break;
                case 7:
                    System.out.println('C');
                    break;
                case 6:
                    System.out.println('D');
                    break;
                default:
                    System.out.println('F');
            }
        }
    }
}
