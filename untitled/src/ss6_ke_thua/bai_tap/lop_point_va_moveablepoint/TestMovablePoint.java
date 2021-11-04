package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(2,3,1,1);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
