public class TestTries {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("banana");
        trie.insert("orange");

        System.out.println(trie.isPrefixValid("app")); // true
        System.out.println(trie.isWordValid("apple")); // true
        System.out.println(trie.isWordValid("app")); // false

        trie.printAllKeys();
    }
}