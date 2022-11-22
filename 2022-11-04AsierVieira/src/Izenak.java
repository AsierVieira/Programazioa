import java.util.Scanner;

public class Izenak {
    public static void main(String[] args) {

        String words;
        String reversedWord = "";
        Scanner input = new Scanner(System.in);
        int strLenght;

        System.out.print("Idatzi 8 izen: ");
        words = input.nextLine();
       
        strLenght = words.length();


        for (int i = strLenght - 1; i >= 0; i--) {
            char c = words.charAt(i);
            reversedWord = reversedWord + c;
        }
        System.out.print("Reverse hitzak:" +reversedWord+ " dira." );
    }
}
//Si meto 8 palabras me salen del revés, pero no se hacer que salgan al presionar R