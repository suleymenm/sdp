import java.util.*;

public class VisitorPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Element> items = new ArrayList<>();

        System.out.println("Enter the number of items (books and fruits) you want to add:");
        int itemCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Enter the type of item (book/fruit):");
            String itemType = scanner.nextLine();

            if (itemType.equalsIgnoreCase("book")) {
                System.out.println("Enter the title of the book:");
                String title = scanner.nextLine();
                items.add(new Book(title));
            } else if (itemType.equalsIgnoreCase("fruit")) {
                System.out.println("Enter the name of the fruit:");
                String name = scanner.nextLine();
                System.out.println("Enter the price per kg of " + name + ":");
                double pricePerKg = scanner.nextDouble();
                System.out.println("Enter the weight of " + name + " in kg:");
                double weight = scanner.nextDouble();
                scanner.nextLine();
                items.add(new Fruit(name, pricePerKg, weight));
            } else {
                System.out.println("Unknown item type. Please enter either 'book' or 'fruit'.");
                i--;
            }
        }


        PriceVisitor priceVisitor = new PriceVisitor();


        for (Element item : items) {
            item.accept(priceVisitor);
        }

        System.out.println("Total cost = " + priceVisitor.getTotalCost());
    }
}