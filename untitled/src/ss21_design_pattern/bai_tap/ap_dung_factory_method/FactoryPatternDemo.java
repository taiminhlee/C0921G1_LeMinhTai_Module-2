package ss21_design_pattern.bai_tap.ap_dung_factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Circle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}
