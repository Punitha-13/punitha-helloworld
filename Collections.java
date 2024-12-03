import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        // Creating a List of Strings
        List<String> list = new ArrayList<>();

        // Adding elements to the List
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Allows duplicates

        // Printing the List
        System.out.println("List: " + list);
    }
}
