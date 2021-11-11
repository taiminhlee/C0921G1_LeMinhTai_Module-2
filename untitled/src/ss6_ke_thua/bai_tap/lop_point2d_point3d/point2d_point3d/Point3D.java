package ss6_ke_thua.bai_tap.lop_point2d_point3d.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D{
    float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    @Override
    public void setY(float y) {
        super.setY(y);
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr1 = {this.getX(), this.getY(), this.getZ()};
        return arr1;
    }

    public String toString() {
        return "Point3D " +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", z=" + z +
                ", arr=" + Arrays.toString(getXYZ());
    }
}
