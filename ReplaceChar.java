package Sample1;
import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char firstChar = str.charAt(0);
        String result = firstChar + str.substring(1).replace(firstChar, '$');
        System.out.println("Result: " + result);
    }
}
