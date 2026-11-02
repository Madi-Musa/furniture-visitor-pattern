package furniture;

import java.math.BigDecimal;

public class PriceCalculationVisitor implements FurnitureVisitor {
    private BigDecimal totalPrice = BigDecimal.ZERO;

    @Override
    public void visitChair(Chair chair) {
        totalPrice = totalPrice.add(chair.getPrice());
    }

    @Override
    public void visitTable(Table table) {
        totalPrice = totalPrice.add(table.getPrice());
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
}
