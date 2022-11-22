import java.util.Scanner;

public class Izartxoak2 {
    public static void main(String[] args) {

        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Esan zenbaki bat (1-10): ");
        num = in.nextInt();
        in.close();

        for (int index = 1; index < 50; index++) {

            if (index % num == 0) {
                System.out.print("*-");
            } else {
                System.out.print(index + "-");
            }
        }
        if (50 % num == 0) {
            System.out.print("*");

        }else{
            System.out.print(50);
        }
    }
}
