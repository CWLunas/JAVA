public class TestOrder {
    public static void main(String[] args) {
        // Create orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();

        // Create orders with names
        Order order3 = new Order("Order 3");
        Order order4 = new Order("Order 4");
        Order order5 = new Order("Order 5");

        // Add items to orders
        Item coffee = new Item("Coffee", 2.5);
        Item tea = new Item("Tea", 2.0);
        Item croissant = new Item("Croissant", 1.75);
        Item muffin = new Item("Muffin", 2.25);

        order1.addItem(coffee);
        order1.addItem(tea);

        order2.addItem(croissant);
        order2.addItem(muffin);

        order3.addItem(coffee);
        order3.addItem(croissant);
        order3.addItem(muffin);

        order4.addItem(tea);
        order4.addItem(croissant);

        order5.addItem(coffee);
        order5.addItem(tea);
        order5.addItem(croissant);
        order5.addItem(muffin);

        // Set orders as ready
        order2.setReady(true);
        order4.setReady(true);
        order5.setReady(true);

        // Test getStatusMessage
        System.out.println("Order 1: " + order1.getStatusMessage());
        System.out.println("Order 2: " + order2.getStatusMessage());
        System.out.println("Order 3: " + order3.getStatusMessage());
        System.out.println("Order 4: " + order4.getStatusMessage());
        System.out.println("Order 5: " + order5.getStatusMessage());

        // Test getOrderTotal
        System.out.println("Order 1 Total: $" + order1.getOrderTotal());
        System.out.println("Order 2 Total: $" + order2.getOrderTotal());
        System.out.println("Order 3 Total: $" + order3.getOrderTotal());
        System.out.println("Order 4 Total: $" + order4.getOrderTotal());
        System.out.println("Order 5 Total: $" + order5.getOrderTotal());

        // Test display method
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}