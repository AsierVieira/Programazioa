import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {

        int number1, number2, number3, number4, number5, sum, product, min, max;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        number1 = in.nextInt();
        System.out.println("Enter second integer: ");
        number2 = in.nextInt();
        System.out.println("Enter third integer: ");
        number3 = in.nextInt();
        System.out.println("Enter forth integer: ");
        number4 = in.nextInt();
        System.out.println("Enter fifth integer: ");
        number5 = in.nextInt();

        in.close();

        sum = number1 + number2 + number3 + number4 + number5;

        System.out.println("The sum is " + sum);

        product = number1 * number2 * number3 * number4 * number5;

        System.out.println("The product is " + product);

        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;

        }
        if (number5 < min) {
            min = number5;
        }
        System.out.println("The min is " + min);

        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }
        if (number5 > max) {
            max = number5;
        }

        System.out.println("The max is " + max);

    }

}
