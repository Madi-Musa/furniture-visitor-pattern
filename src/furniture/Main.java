package furniture;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Furniture> furnitureItems = List.of(
                new Chair("Oak", new BigDecimal("75.50")),
                new Table("Walnut", new BigDecimal("240.00")),
                new Chair("Pine", new BigDecimal("49.99")),
                new Table("Oak", new BigDecimal("180.00"))
        );

        InformationVisitor informationVisitor = new InformationVisitor();
        PriceCalculationVisitor priceVisitor = new PriceCalculationVisitor();

        System.out.println("Furniture Management System");
        for (Furniture furniture : furnitureItems) {
            furniture.accept(informationVisitor);
        }

        for (Furniture furniture : furnitureItems) {
            furniture.accept(priceVisitor);
        }
        System.out.println("Total price: " + priceVisitor.getTotalPrice());
    }
}
