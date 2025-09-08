package Ex1;
import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {
        int baseTicket = 200;
        double ticketPrice = baseTicket;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = s.nextInt();

        System.out.print("Enter the Day of Booking (1 for Monday, ..., 7 for Sunday): ");
        int day = s.nextInt();

        if (age < 5) {
            ticketPrice = 0;
            System.out.println("The Ticket is Free");
        } else if (age >= 5 && age <= 18) {
            System.out.println("You are eligible for 40% age discount.");
            ticketPrice = baseTicket * 0.6; 
        } else if (age >= 19 && age <= 60) {
           
            ticketPrice = baseTicket;
        } else if (age > 60) {
            System.out.println("You are eligible for 30% age discount.");
            ticketPrice = baseTicket * 0.7;  
        }

        if (day >= 1 && day <= 5) {
            System.out.println("You are eligible for an additional 10% weekday booking discount.");
            ticketPrice *= 0.9;
        }

        System.out.printf("Final Ticket Price: %.2f\n", ticketPrice);

    }
}

