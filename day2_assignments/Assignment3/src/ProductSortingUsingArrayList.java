
import java.util.ArrayList;
import java.util.Collections;

public class ProductSortingUsingArrayList {
    public static void main(String[] args) {
        // Step 1: Create and initialize the ArrayList
        ArrayList<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Smartphone");
        products.add("Headphones");
        products.add("Camera");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Mouse");

        // Display original product list
        System.out.println("Original product list:");
        for (String product : products) {
            System.out.println(product);
        }

        // Step 2: Sort the ArrayList
        Collections.sort(products);

        // Display sorted product list
        System.out.println("\nSorted product list:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
