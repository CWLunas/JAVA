public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void printValuesBackward() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.value);
            current = current.prev;
        }
    }

    public Node pop() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            Node node = head;
            head = null;
            tail = null;
            length = 0;
            return node;
        } else {
            Node node = tail;
            tail = tail.prev;
            tail.next = null;
            length--;
            return node;
        }
    }

    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return length;
    }

    public void insertAt(Node newNode, int index) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            prepend(newNode);
        } else if (index == length) {
            append(newNode);
        } else {
            Node current = head;
            int currentIndex = 0;

            while (currentIndex < index) {
                current = current.next;
                currentIndex++;
            }

            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            length++;
        }
    }

    public void removeAt(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (index == length - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node current = head;
            int currentIndex = 0;

            while (currentIndex < index) {
                current = current.next;
                currentIndex++;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        length--;
    }

    public boolean isPalindrome() {
        if (length <= 1) {
            return true;
        }

        Node forward = head;
        Node backward = tail;

        while (forward != backward && forward.prev != backward) {
            if (forward.value != backward.value) {
                return false;
            }
            forward = forward.next;
            backward = backward.prev;
        }

        return true;
    }

    private void prepend(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    void append(Node newNode) {
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
}