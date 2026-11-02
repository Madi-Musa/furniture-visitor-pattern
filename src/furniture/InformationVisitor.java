package furniture;

public class InformationVisitor implements FurnitureVisitor {
    @Override
    public void visitChair(Chair chair) {
        System.out.println("Chair | Material: " + chair.getMaterial()
                + " | Price: " + chair.getPrice());
    }

    @Override
    public void visitTable(Table table) {
        System.out.println("Table | Material: " + table.getMaterial()
                + " | Price: " + table.getPrice());
    }
}
