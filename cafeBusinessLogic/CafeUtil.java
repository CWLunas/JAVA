import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

    // Get Streak Goal + Ninja Bonus
    public int getStreakGoal(int numweeks) {
        int sum = 0;
        numweeks = 15;
        for (int week = 1; week <= numweeks; week++) {
            sum += week;
        }
        return sum;
    }

    // Get Order Total
    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for (double price : lineItems) {
            sum += price;
        }
        return sum;
    }

    // addCustomer
    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people ahead of you.%n", customerList.size());
        customerList.add(userName);
        System.out.println(customerList);
    }

    // Display Coffee Menu
    public void displayMenu(ArrayList<String> menuItems) {
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s %n", id, menuItems.get(id));
        }
    }

    // Price chart
    // Ninja bonus: Format for currency
    public void printPriceChart(String productName, double price, int maxQuantity) {
        System.out.println(productName);
        for (int quantity = 1; quantity <= maxQuantity; quantity++) {
            System.out.printf("%s - $%.2f%n", quantity, quantity * price);
        }
        System.out.println();
    }

    // Display Coffee Menu
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> priceIndex) {
        if (menuItems.size() != priceIndex.size()) {
            return false;
        }
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s -- $%.2f \n", id, menuItems.get(id), priceIndex.get(id));
        }
        return true;
    }

   //Sensei bonus
    public void addCustomers(ArrayList<String> customerList) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Please enter a customer name or press Q to quit:");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            customerList.add(input);
            System.out.printf("%s name was added to the list.%n", input);
            System.out.println(customerList);
        }
    }
}