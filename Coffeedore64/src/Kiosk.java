import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private int index;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        return name.equals(other.name) && price == other.price;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Double.hashCode(price);
    }
}

class Order {
    private String customerName;
    private ArrayList<Item> items;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}

public class Kiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;
    private DecimalFormat decimalFormat;

    public Kiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.decimalFormat = new DecimalFormat("0.00");
    }

    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size());
        menu.add(newItem);
    }

    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + decimalFormat.format(item.getPrice()));
        }
    }

    public void newOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter customer name for new order:");
        String name = scanner.nextLine();
        Order order = new Order(name);

        System.out.println("Menu:");
        displayMenu();

        String itemNumber;
        do {
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = scanner.nextLine();

            if (!itemNumber.equals("q")) {
                try {
                    int index = Integer.parseInt(itemNumber);
                    if (index >= 0 && index < menu.size()) {
                        Item selectedItem = menu.get(index);
                        order.addItem(selectedItem);
                        System.out.println("Added " + selectedItem.getName() + " to the order.");
                    } else {
                        System.out.println("Invalid menu item index.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a menu item index or q to quit.");
                }
            }
        } while (!itemNumber.equals("q"));

        orders.add(order);

        System.out.println("Order details:");
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Items:");

        // Calculate item subtotal
        ArrayList<Item> orderedItems = order.getItems();
        ArrayList<Item> uniqueItems = new ArrayList<>();
        for (Item item : orderedItems) {
            if (!uniqueItems.contains(item)) {
                uniqueItems.add(item);
            }
        }

        double grandTotal = 0.0;
        for (Item item : uniqueItems) {
            int quantity = 0;
            double subtotal = 0.0;

            for (Item orderedItem : orderedItems) {
                if (orderedItem.equals(item)) {
                    quantity++;
                    subtotal += orderedItem.getPrice();
                }
            }

            System.out.println(
                    item.getName() + " (Quantity: " + quantity + ") -- Subtotal: $" + decimalFormat.format(subtotal));
            grandTotal += subtotal;
        }

        System.out.println("Grand Total: $" + decimalFormat.format(grandTotal));
    }

    // Ninja Bonus: Add menu item manually by taking user input
    public void addMenuItemByInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the new menu item:");
        String name = scanner.nextLine();

        System.out.println("Enter the price of the new menu item:");
        double price = scanner.nextDouble();
        scanner.nextLine();

        addMenuItem(name, price);

        System.out.println("New menu item added: " + name + " -- $" + decimalFormat.format(price));
    }
}