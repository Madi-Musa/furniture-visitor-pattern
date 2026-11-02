package furniture;

import java.math.BigDecimal;

public class Chair implements Furniture {
    private final String material;
    private final BigDecimal price;

    public Chair(String material, BigDecimal price) {
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
        visitor.visitChair(this);
    }
}
