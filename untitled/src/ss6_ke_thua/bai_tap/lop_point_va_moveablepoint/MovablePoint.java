package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MovablePoint extends Point{
    float xSpeed;
    float ySpeed;
    MovablePoint(float x,float y,float xSpeed,float ySeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySeed;
    }
    MovablePoint(){
    }
    MovablePoint(float xSpeed,float ySeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] arr={this.xSpeed,this.ySpeed};
        return  arr;
    }

    @Override
    public String toString() {
        return "MovablePoint(" +
                this.getX() +
                "," + this.getY() +
                "), Speed=(" + xSpeed +
                "," + ySpeed +
                ")";
    }
    public MovablePoint move(){
        this.setX(this.getX()+xSpeed);
        this.setY(this.getY()+ySpeed);
        return this;
    }
}
