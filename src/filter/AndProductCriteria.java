package filter;

import java.util.List;

public class AndProductCriteria implements ProductCriteria{
    private ProductCriteria first;
    private ProductCriteria second;

    public AndProductCriteria(ProductCriteria first, ProductCriteria second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public List<Product> meetCriteria(List<Product> products) {
        return second.meetCriteria(first.meetCriteria(products));
    }
}
