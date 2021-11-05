package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Rectangle extends Shape{
    private double width=1.0,length=1.0;
   public Rectangle(){
    }
  public   Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
   public Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", area="
                + getArea()
                + ", perimeter"
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
