
import java.util.Arrays;

public class ProductSorting {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array
        String[] products = {
            "Laptop",
            "Smartphone",
            "Headphones",
            "Camera",
            "Keyboard",
            "Monitor",
            "Mouse"
        };

        // Display original product list
        System.out.println("Original product list:");
        for (String product : products) {
            System.out.println(product);
        }

        // Step 2: Sort the array
        Arrays.sort(products);

        // Display sorted product list
        System.out.println("\nSorted product list:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
