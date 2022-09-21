import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveObjectFromListUsingRemoveMethodString {
    public static void main(String[] args)
    {

        // Declare an empty List of size 5
        List<String> list = new ArrayList<String>(5);

        // Add elements to the list
        list.add("Remove");
        list.add("add");
        list.add("Sub");
        list.add("Divide");
        list.add("Multiply");

        // Element needed to be removed
        String obj = "add";

        // Initial list
        System.out.println("Initial List: " + list);

        // remove element
        list.remove(obj);

        // Final list
        System.out.println("Final List: " + list);
    }
}
