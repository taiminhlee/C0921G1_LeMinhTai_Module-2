package ss6_ke_thua.bai_tap.lop_point2d_point3d;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    Point2D() {
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D " +
                "x=" + x +
                ", y=" + y +
                ", arr=" + Arrays.toString(getXY());
    }
}

class Point3D extends Point2D {
    float z;

    Point3D() {
    }

    Point3D(float x, float y, float z) {
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
