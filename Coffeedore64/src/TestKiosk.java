public class TestKiosk {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();

        kiosk.addMenuItem("Banana", 2.00);
        kiosk.addMenuItem("Americano", 2.50);
        kiosk.addMenuItem("Oh I'm latte for work", 4.50);
        kiosk.addMenuItem("Cappuccino", 3.00);
        kiosk.addMenuItem("Double Expresso", 4.00);
        kiosk.addMenuItem("Chocolate Expresso Beans", 9.00);
        kiosk.addMenuItem("Lemon Cake", 3.75);
        kiosk.addMenuItem("Cherry Scone", 4.00);
        kiosk.addMenuItem("Muffin", 4.00);
        kiosk.addMenuItem("Adopt A Barista", 5.00);

        kiosk.newOrder();

        // Ninja Bonus: Add menu item manually
        kiosk.addMenuItemByInput();
        kiosk.displayMenu();
    }
}