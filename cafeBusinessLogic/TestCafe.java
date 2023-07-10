import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil appTest = new CafeUtil();

        // App Test Cases
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 15 %s %n%n", appTest.getStreakGoal(15));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = { 3.75, 7.75, 4.50, 4.85 };
        System.out.printf("Order total: %.2f %n%n", appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");

        List<String> loadMenu = Arrays.asList("Irish coffee", "Cappuccino", "Latte", "Mocha");
        ArrayList<String> menu = new ArrayList<>(loadMenu);
        appTest.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<>();

        // Test 4 times
        for (int i = 0; i < 3; i++) {
            appTest.addCustomer(customers);
            System.out.println();
        }

        System.out.println("----- Display Menu NINJA BONUS Test-----");
        List<Double> loadPrices = Arrays.asList(7.75, 3.75, 4.50, 4.85);
        ArrayList<Double> prices = new ArrayList<>(loadPrices);

        appTest.displayMenu(menu, prices);

        System.out.println("----- Price Chart Test-----");
        appTest.printPriceChart("Chai Latte Mix", 4.50, 3);
        appTest.printPriceChart("Specialty Coaster", 2.50, 5);

        System.out.println("\n----- Barista Adding Test-----");
        ArrayList<String> newCustomers = new ArrayList<>();

        appTest.addCustomers(newCustomers);
    }
}
