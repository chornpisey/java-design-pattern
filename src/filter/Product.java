package filter;

public class Product {
    private String name;
    private String category;
    private boolean inStock;

    public Product(String name, String category, boolean inStock) {
        this.name = name;
        this.category = category;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
