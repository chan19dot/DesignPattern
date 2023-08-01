package OpenClosedPrinciple;

public class ColorSpecification implements Specification<Product>{

    private  Color color;
    @Override
    public boolean isSatisfied(Product p) {
        return p.color==this.color;
    }
}
