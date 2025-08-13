import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        int result1 = a + b * c;     // multiplication has higher precedence
        int result2 = a * b + c;
        int result3 = c + a / b;     // division before addition
        int result4 = a % b + c;     // modulus before addition

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", "
                + result3 + ", and " + result4);
    }
}
