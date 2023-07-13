public class TestDLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.append(new Node(10));
        dll.append(new Node(20));
        dll.append(new Node(30));

        System.out.println("Values in the list:");
        dll.printValuesBackward();

        Node poppedNode = dll.pop();
        System.out.println("\nPopped Node: " + poppedNode.value);

        System.out.println("\nContains 20? " + dll.contains(20));
        System.out.println("Contains 40? " + dll.contains(40));

        System.out.println("\nSize of the list: " + dll.size());

        Node newNode = new Node(25);
        dll.insertAt(newNode, 1);
        System.out.println("\nValues in the list after inserting 25 at index 1:");
        dll.printValuesBackward();

        dll.removeAt(1);
        System.out.println("\nValues in the list after removing node at index 1:");
        dll.printValuesBackward();

        System.out.println("\nIs the list a palindrome? " + dll.isPalindrome());
    }
}