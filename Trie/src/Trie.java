public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            if (!current.hasChild(ch))
                current.addChild(ch);
            current = current.getChild(ch);
        }
        current.setEndOfWord(true);
    }

    public boolean isPrefixValid(String prefix) {
        Node current = root;
        for (char ch : prefix.toCharArray()) {
            if (!current.hasChild(ch))
                return false;
            current = current.getChild(ch);
        }
        return true;
    }

    public boolean isWordValid(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            if (!current.hasChild(ch))
                return false;
            current = current.getChild(ch);
        }
        return current.isEndOfWord();
    }

    public void printAllKeys() {
        Node current = root;
        printKeys(current, "");
    }

    private void printKeys(Node node, String prefix) {
        if (node.isEndOfWord())
            System.out.println(prefix);
        for (char ch : node.getChildren().keySet()) {
            Node child = node.getChild(ch);
            printKeys(child, prefix + ch);
        }
    }
}