package ss21_design_pattern.bai_tap.ap_dung_factory_method;

public class ShapeFactory {
    public Shape getShape(String type){
        if ("Rectangle".equals(type)){
            return new Rectangle();
        }else if ("Square".equals(type)){
            return new Square();
        }else {
            return new Circle();
        }
    }
}
