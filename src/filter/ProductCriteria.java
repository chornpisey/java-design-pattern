package filter;

import java.util.List;

public interface ProductCriteria {
    List<Product> meetCriteria(List<Product> products);
}
