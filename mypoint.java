package day4;

public class mypoint {

    int x = 0;
    int y = 0;
    int xy[] = {0, 0};

    public void mypoint() {

    }

    public void mypoint(int x, int y) {


    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;

    }

    @Override
    public String toString() {
        return "mypoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXy() {
        return xy;
    }

    public void setXy(int[] xy) {
        this.xy = xy;
    }


}
