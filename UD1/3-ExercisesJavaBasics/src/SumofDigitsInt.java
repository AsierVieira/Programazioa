import java.util.Scanner;

public class SumofDigitsInt {
    public static void main(String[] args) {

        int num1;
        int inDigit;
        int a = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num1 = in.nextInt();

        in.close();

        while (num1 > 0) {
            inDigit = num1 % 10;
            a = a + inDigit;
            num1 /= 10;
        }
        System.out.println("The sum of all digits is: " + a);
    }
}
