public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        this.head = null;
    }
    
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
        if (head == null) {
            return; // List is empty, nothing to remove
        }
        
        if (head.next == null) {
            head = null; // Only one node in the list, remove it
            return;
        }
        
        Node runner = head;
        while (runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null; // Remove the last node
    }
    
    public void printValues() {
        Node runner = head;
        while (runner != null) {
            System.out.print(runner.value + " ");
            runner = runner.next;
        }
        System.out.println();
    }
    
    public Node find(int value) {
        Node runner = head;
        while (runner != null) {
            if (runner.value == value) {
                return runner;
            }
            runner = runner.next;
        }
        return null; // Node with the value not found
    }
    
    public void removeAt(int n) {
        if (head == null || n < 0) {
            return; // List is empty or invalid index
        }
        
        if (n == 0) {
            head = head.next; // Remove the first node
            return;
        }
        
        Node runner = head;
        int count = 0;
        while (runner != null && count < n) {
            if (count == n - 1 && runner.next != null) {
                runner.next = runner.next.next; // Remove the node after n nodes
                return;
            }
            runner = runner.next;
            count++;
        }
    }
}