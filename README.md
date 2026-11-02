# Furniture Management System

## Project description
A Java console application for Assignment #6 that displays furniture information and calculates the total price. It uses only the Java standard library.

## Visitor Pattern implementation
`Furniture` is the element interface; `Chair` and `Table` are its concrete elements. `FurnitureVisitor` declares one visit method for each element type. `InformationVisitor` displays material and price, while `PriceCalculationVisitor` accumulates prices using `BigDecimal` for exact decimal arithmetic. `Main` traverses the same `List<Furniture>` once for each visitor. Create a new price visitor for each independent calculation.

## Double dispatch
Calling `furniture.accept(visitor)` first selects the actual element's `accept` implementation. `Chair` calls `visitor.visitChair(this)` and `Table` calls `visitor.visitTable(this)`. The actual visitor then determines which operation runs. The result depends on both the element and the visitor, without casts or type checks.

## Five Clean Code principles
1. **Meaningful Names:** `Furniture`, `InformationVisitor`, and `PriceCalculationVisitor` clearly describe their roles.
2. **Single Responsibility:** elements store furniture data; each visitor performs one operation; `Main` creates and traverses the collection.
3. **No type checking:** double dispatch selects the correct visit method without `instanceof`, reflection, or type-checking chains.
4. **Encapsulation:** fields are private, element fields are final, and visitors read only the material and price through getters. These immutable values expose the data required for the operations without allowing visitors to modify elements.
5. **Extensibility:** a third operation, such as a shipping cost visitor, can implement `FurnitureVisitor` and its two methods, then be passed to `accept` during traversal. Neither `Chair` nor `Table` needs to change.

## How to run in IntelliJ IDEA
1. Open the `furniture-visitor-pattern` folder in IntelliJ IDEA.
2. Select an installed Java SDK (JDK 25 was used for verification) in **File > Project Structure > Project**.
3. If necessary, mark `src` as **Sources Root** using **Mark Directory as** from its context menu.
4. Open `src/furniture/Main.java` and run `Main.main()` using the green run icon.
5. The console displays four furniture items and `Total price: 545.49`.
