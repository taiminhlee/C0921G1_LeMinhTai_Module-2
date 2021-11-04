package ss6_ke_thua.bai_tap.thiet_ke_va_phat_trien_lop_triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle.toString());
        Triangle triangle1=new Triangle(2,4,6,"white",false);
        System.out.println(triangle1.toString());
    }
}
