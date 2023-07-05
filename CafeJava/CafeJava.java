package CafeJava;


public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 4.0;
        double cappuccinoPrice = 3.75;
    
        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions
        boolean isReadyOrder1 = false; // Cindhuri's order
        boolean isReadyOrder2 = true; // Sam's order
        boolean isReadyOrder3 = true; // Jimmy's order
        boolean isReadyOrder4 = false; // Noah's order
    
        // APP INTERACTION SIMULATION
        
        // Cindhuri's order
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
        
        // Noah's order
        String noahDrink = "cappuccino";
        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Noah"
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        
        // Sam's order
        int samLatteCount = 2;
        double samTotal = samLatteCount * lattePrice;
        System.out.println(generalGreeting + customer2); // Displays "Welcome to Cafe Java, Sam"
        System.out.println(displayTotalMessage + samTotal);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        
        // Jimmy's order
        double jimmyCoffeePrice = 2.0;
        double jimmyLattePrice = 4.0;
        double jimmyTotal = jimmyLattePrice - jimmyCoffeePrice; // Jimmy was charged for coffee but ordered a latte
        System.out.println(generalGreeting + customer3); // Displays "Welcome to Cafe Java, Jimmy"
        System.out.println(displayTotalMessage + jimmyTotal);
    }
}