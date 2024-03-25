package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }


    public double distance(Point point) {
        int distanceX = point.getX() - this.x;
        int distanceY = point.getY() - this.y;
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }


    public double distance(int a, int b) {
        int distanceX = a - this.x;
        int distanceY = b - this.y;
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }
}
