package Sample1;
import java.util.Scanner;
public class VowelConsonantCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String text = sc.nextLine();
        String vowelsList = "";
        String consonantsList = "";
        int vowelCount = 0, consm onantCount = 0;
        for (char ch : text.toCharArray())
        {
            if (Character.isLetter(ch)) 
            { 
                if ("AEIOUaeiou".indexOf(ch) != -1)
                {
                    vowelsList += ch + ", ";
                    vowelCount++;
                } else 
                {
                    consonantsList += ch + ", ";
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels are: " + vowelsList + "Total = " + vowelCount);
        System.out.println("Consonants are: " + consonantsList + "Total = " + consonantCount);
    }
}
