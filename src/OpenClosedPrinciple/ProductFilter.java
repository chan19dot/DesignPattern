package OpenClosedPrinciple;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product>{

    @Override
    public Stream<Product> filter(List<Product> products, Specification specification) {
        return null;
    }
}
