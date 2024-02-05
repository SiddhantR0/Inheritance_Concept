package Models;

public class Rectangle {
    int length;
    int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public double getArea(){
        return length * breadth;
    }
}
