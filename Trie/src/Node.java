import java.util.HashMap;
import java.util.Map;

class Node {
    private Map<Character, Node> children;
    private boolean isEndOfWord;

    public Node() {
        children = new HashMap<>();
        isEndOfWord = false;
    }

    public boolean hasChild(char ch) {
        return children.containsKey(ch);
    }

    public Node getChild(char ch) {
        return children.get(ch);
    }

    public void addChild(char ch) {
        children.put(ch, new Node());
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public Map<Character, Node> getChildren() {
        return children;
    }
}