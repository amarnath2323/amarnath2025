package Ex4;
import java.util.Scanner;
class FoodOrder
{
    private int orderId;
    private String foodItemName;
    private double price;
    private int quantity;

    public FoodOrder(int orderId, String foodItemName, double price, int quantity) 
    {
        this.orderId = orderId;
        this.foodItemName = foodItemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateBill()
    {
        return (price * quantity) + 50; 
    }

    public void updateQuantity(int newQty)
    {
        this.quantity = newQty;
        System.out.println("Quantity updated successfully!");
    }

    public void displayOrderInfo() {
        System.out.println("\n--- Order Details ---");
        System.out.println("Order ID: " + orderId);
        System.out.println("Food Item: " + foodItemName);
        System.out.println("Price per Item: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill (incl. ₹50 delivery): ₹" + calculateBill());
    }
}
public class Management
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Food Item Name: ");
        String item = sc.nextLine();
        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        FoodOrder order = new FoodOrder(id, item, price, qty);

        int choice;
        do 
        {
            System.out.println("\n===== Food Order Menu =====");
            System.out.println("1. Display Order Info");
            System.out.println("2. Update Quantity");
            System.out.println("3. Show Total Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    order.displayOrderInfo();
                    break;

                case 2:
                    System.out.print("Enter new Quantity: ");
                    int newQty = sc.nextInt();
                    order.updateQuantity(newQty);
                    break;

                case 3:
                    System.out.println("Total Bill = ₹" + order.calculateBill());
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

    }
}