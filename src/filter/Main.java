package filter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("iPhone", "Electronics", true),
                new Product("Laptop", "Electronics", false),
                new Product("Book", "Books", true)
        );

        ProductCriteria electronics = new CategoryCriteria("Electronics");
        ProductCriteria instock = new InStockCriteria();

        ProductCriteria electronicsAndInStock = new AndProductCriteria(electronics, instock);
        ProductCriteria electronicsOrInStock = new OrProductCriteria(electronics, instock);

        System.out.println("Electronics and instock");
        electronicsAndInStock.meetCriteria(products).forEach(product -> System.out.println(product));

        System.out.println("\nElectronics or instock");
        electronicsOrInStock.meetCriteria(products).forEach(product -> System.out.println(product));
    }
}
