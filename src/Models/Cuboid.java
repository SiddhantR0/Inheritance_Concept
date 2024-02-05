package Models;

public class Cuboid extends Rectangle {
    int height;

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void generateVolume() {

        double areaOfRectangle = getArea();

        double volumeOfCuboid = areaOfRectangle * height;

        System.out.println("The area of Cuboid is: " + volumeOfCuboid);
    }
}
