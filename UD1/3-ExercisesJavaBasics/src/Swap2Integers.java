import java.util.Scanner;

public class Swap2Integers {

    public static void main(String[] args) {
        int num1, num2, temp=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        num1 = in.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = in.nextInt();

        in.close();

            temp = num1;
            num1 = num2;
            num2 = temp;
            

        System.out.println("After the swap, first integer is: "+num1 +", second integer is: "+num2);
    }
}

