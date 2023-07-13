public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        
        sll.remove();
        sll.remove();
        
        sll.printValues();
        
        Node node = sll.find(10);
        if (node != null) {
            System.out.println("Found node with value 10");
        } else {
            System.out.println("Node with value 10 not found");
        }
        
        sll.removeAt(0);
        sll.removeAt(2);
        
        sll.printValues();
    }
}