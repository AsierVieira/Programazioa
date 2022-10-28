import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {

        int inNumber;
        int inDigit;
        int a = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        inNumber = in.nextInt();

        in.close();
    
        while (inNumber > 0) {
            inDigit = inNumber % 10; // esto extrae el último digito

            a = a * 10 + inDigit; // esto lo hago para que guarde el número reverso completo

            inNumber /= 10;
        }
        System.out.print(a);
        if (inNumber < 0) {
            System.out.println("Its not a positive number");
        }
    }
}
