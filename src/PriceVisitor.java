class PriceVisitor implements Visitor {
    private double totalCost = 0;

    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle());
    }

    @Override
    public void visit(Fruit fruit) {
        double cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " costs = " + cost);
        totalCost += cost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}