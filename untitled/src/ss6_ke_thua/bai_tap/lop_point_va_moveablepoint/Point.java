package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

import java.util.Arrays;

public class Point {
   private float x;
    private float y;
    Point(){
    }
    Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] arr={this.x,this.y};
        return arr;
    }
    public void  setXY(float x,float y){
        float[] arr={this.x,this.y};
    }

    @Override
    public String toString() {
        return "Point" +
                "x=" + x +
                ", y=" + y +
                "arr=" + Arrays.toString(getXY());
    }
}
