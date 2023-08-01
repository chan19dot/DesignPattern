package OpenClosedPrinciple;

public class SizeSpecification implements Specification<Product>{
    private Size size;

    @Override
    public boolean isSatisfied(Product p) {
        return this.size==p.size;
    }
}
