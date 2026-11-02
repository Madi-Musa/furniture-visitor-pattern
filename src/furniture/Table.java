package furniture;

import java.math.BigDecimal;

public class Table implements Furniture {
    private final String material;
    private final BigDecimal price;

    public Table(String material, BigDecimal price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void accept(FurnitureVisitor visitor) {
        visitor.visitTable(this);
    }
}
