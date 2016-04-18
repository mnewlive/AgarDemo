package ru.hotbors.agarone;

/**
 * Created by Vadim on 10.12.2015.
 */
public class SimpleCircle {
    protected int x;
    protected int y;
    protected int radius;
    public int color;
    public SimpleCircle getCircleArea;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }




    //3 sozdaem constructor dlea x i y , radius initializiruem const INIT_RADIUS(alt ctrl C)

   /* public MainCircle(int x, int y) {
        this.x = x;
        this.y = y;
        radius = INIT_RADIUS;
    }
*/

    public SimpleCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //alt insert Getter 2

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }


    public boolean isIntersect(SimpleCircle circle) {
        return radius + circle.radius >=Math.sqrt(Math.pow(x - circle.x, 2) + (Math.pow(y - circle.y, 2)));
    }

    public SimpleCircle getCircleArea() {
        return new SimpleCircle(x, y, radius*3);
    }
}
