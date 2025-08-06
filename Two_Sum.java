package sample;
import java.util.Scanner;

public class Two_Sum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];

        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < 4; i++) 
        {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        for (int i = 0; i < 4; i++)
        {
            for (int j = i + 1; j < 4; j++) 
            {
                if (nums[i] + nums[j] == target)
                {
                    System.out.println("Indices: " + i + ", " + j);
                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                    return;
                }
            }
        }

        System.out.println("No match found.");
    }
}
