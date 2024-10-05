
class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    @Override
    public String toString() {
        return "Product [Name: " + name + ", Price: $" + price + "]";
    }
}

public class Prototype {
    public static void main(String[] args) {
        try {
            // Create an original product
            Product originalProduct = new Product("Laptop", 1200.00);
            System.out.println("Original: " + originalProduct);

            // Clone the original product
            Product clonedProduct = originalProduct.clone();
            System.out.println("Cloned: " + clonedProduct);

            // Modify the cloned product's price
            clonedProduct.setPrice(999.99);
            System.out.println("Modified Cloned: " + clonedProduct);

            // Check that the original product remains unchanged
            System.out.println("Original after cloning: " + originalProduct);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
