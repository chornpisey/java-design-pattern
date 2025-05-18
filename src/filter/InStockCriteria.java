package filter;

import java.util.ArrayList;
import java.util.List;

public class InStockCriteria implements ProductCriteria{
    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> filtered = new ArrayList<>();
        for (Product product : products) {
            if (product.isInStock()){
                filtered.add(product);
            }
        }
        return filtered;
    }
}
