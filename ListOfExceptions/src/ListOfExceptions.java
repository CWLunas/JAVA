import java.util.ArrayList;

public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Casted value: " + castedValue);
            } catch (ClassCastException e) {
                System.out.println("Exception occurred at index " + i);
                System.out.println("Value triggering the error: " + myList.get(i));
                System.out.println("Error message: " + e.getMessage());
            }
        }
    }
}