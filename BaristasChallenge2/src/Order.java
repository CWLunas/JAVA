import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private double price;

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
}

class Order {
    private List<Item> items;
    private boolean isReady;
    private String name;

    public Order() {
        items = new ArrayList<>();
        isReady = false;
        name = "Unspecified";
    }

    public Order(String name) {
        items = new ArrayList<>();
        isReady = false;
        this.name = name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getStatusMessage() {
        if (isReady) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Order Information: " + name);
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
        System.out.println("Status: " + getStatusMessage());
    }

    public void setReady(boolean isReady) {
        this.isReady = isReady;
    }
}