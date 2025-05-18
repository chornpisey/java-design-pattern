package filter;

import java.util.ArrayList;
import java.util.List;

public class OrProductCriteria implements ProductCriteria{
    private ProductCriteria first;
    private ProductCriteria second;

    public OrProductCriteria(ProductCriteria first, ProductCriteria second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> firstResult = new ArrayList<>(first.meetCriteria(products));
        List<Product> secondResult = new ArrayList<>(second.meetCriteria(products));
        List<Product> result = new ArrayList<>(firstResult);
        for (Product product : secondResult) {
            if(!result.contains(product)){
                result.add(product);
            }
        }
        return result;
    }
}
