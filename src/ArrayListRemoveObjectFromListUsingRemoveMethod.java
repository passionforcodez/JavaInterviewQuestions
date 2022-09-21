import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveObjectFromListUsingRemoveMethod {
    public static void main(String[] args)
    {

        // Declare an empty List of size 5
        List<Double> list = new ArrayList<Double>(5);

        // Add elements to the list
        list.add(5.0);
        list.add(10.5);
        list.add(15.1);
        list.add(20.6);
        list.add(25.2);

        // Element needed to be removed
        double obj = 15.1;

        // Initial list
        System.out.println("Initial List: " + list);

        // remove element
        list.remove(obj);

        // Final list
        System.out.println("Final List: " + list);
    }
}
