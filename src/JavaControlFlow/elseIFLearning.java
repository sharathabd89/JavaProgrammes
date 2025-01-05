package JavaControlFlow;

public class elseIFLearning {
    public static void main(String[] args)
    {
// First check if all numbers are equal
        int a=10;
        int b=13;
        int c=17;
        if (a == b && b == c) {
            System.out.println("All three numbers are equal");
        }
        // Then check pairs of equal numbers
        else if (a == b && a > c) {
            System.out.println("A and B are equal and largest");
        }
        else if (a == c && a > b) {
            System.out.println("A and C are equal and largest");
        }
        else if (b == c && b > a) {
            System.out.println("B and C are equal and largest");
        }
        // Finally check individual largest number
        else if (a > b && a > c) {
            System.out.println("A is the largest number");
        }
        else if (b > a && b > c) {
            System.out.println("B is the largest number");
        }
        else {
            System.out.println("C is the largest number");
        }
    }
}