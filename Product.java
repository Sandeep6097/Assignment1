package Product;
import java.util.*;
public class Product {
    public int id;
    public String name;
    public double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        // Adding products
        productList.add(new Product(1, "Chocolate", 100.0));
        productList.add(new Product(2, "Ice-Cream", 25.0));
        productList.add(new Product(3, "Parle-G", 80.0));
		System.out.println();

        // Reading products
        System.out.println("All Products:");
        for (Product product : productList) {
            System.out.println(product);
        }
		System.out.println();

        // Updating product price
        Product productToUpdate = productList.get(1);
        productToUpdate.price =35.0 ;
        System.out.println("Updated Product: " + productToUpdate);
		System.out.println();

        // Deleting a product
        Product productToDelete = productList.get(2);
        productList.remove(productToDelete);
        System.out.println("Product Deleted: " + productToDelete);
		System.out.println();

        // After deletion, display remaining products
        System.out.println("Remaining Products:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}