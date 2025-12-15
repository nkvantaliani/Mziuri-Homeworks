package hw2;

public abstract class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x<0){
            return;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y<0){
            return;
        }
        this.y = y;
    }
    public abstract void displayName();
    public abstract void displayData();
    public abstract double getPerimeter();

}
