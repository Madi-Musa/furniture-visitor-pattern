package furniture;

public interface FurnitureVisitor {
    void visitChair(Chair chair);

    void visitTable(Table table);
}
