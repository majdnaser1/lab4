package day4;

public class ball {

    float x;
    float y;
    int radius;
    float xdelta;
    float ydelta;


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getXdelta() {
        return xdelta;
    }

    public float getYdelta() {
        return ydelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setXdelta(float xdelta) {
        this.xdelta = xdelta;
    }

    public void setYdelta(float ydelta) {
        this.ydelta = ydelta;
    }

    @Override
    public String toString() {
        return "ball{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", xdelta=" + xdelta +
                ", ydelta=" + ydelta +
                '}';
    }

    public void ball (float x, float y, int radius, float xdelta, float ydelta){


    }
    public void move() {
        x += xdelta;
        y += ydelta;
    }



    public void reflectHorizontal() {
        xdelta = -xdelta;
    }



    public void reflectVertical() {
        ydelta = -ydelta;
    }




}