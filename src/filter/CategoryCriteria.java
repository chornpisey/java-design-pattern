package filter;

import java.util.ArrayList;
import java.util.List;

public class CategoryCriteria implements ProductCriteria{
    private String category;

    public CategoryCriteria(String category) {
        this.category = category;
    }

    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> filtered = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(this.category)){
                filtered.add(product);
            }
        }
        return filtered;
    }
}
