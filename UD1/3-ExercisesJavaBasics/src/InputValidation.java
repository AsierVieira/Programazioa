import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        int numberIn;
        boolean isValid = false;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = in.nextInt();

            if (numberIn >= 0 && numberIn <= 10 || numberIn >= 90 && numberIn <= 100) {
                isValid = true;
                System.out.println(numberIn);
            } else {
                System.out.println("Invalid input, try again...");
            }

        } while(!isValid);
        in.close();
    }
}
