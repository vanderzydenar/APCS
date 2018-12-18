import java.lang.*;

public class Box {

    double width;
    double height;
    double length;
    double volume;
    double surfaceArea;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box previousBox) {
        this.width = previousBox.width;
        this.height = previousBox.height;
        this.length = previousBox.length;
    }

    public Box big(Box previousBox) {
        Box newBox = new Box(previousBox.width*1.25, previousBox.height*1.25, previousBox.length*1.25);
        return newBox;
    }

    public Box small(Box previousBox) {
        Box newBox = new Box(previousBox.width*0.75, previousBox.height*0.75, previousBox.length*0.75);
        return newBox;
    }

    public boolean nests(Box outsideBox) {
        if(height < outsideBox.height && width < outsideBox.width && length < outsideBox.length) {
            return true;
        } else {
            return false;
        }
    }

    public double volume() {
        volume = width*height*length;
        return volume;
    }

    private double topArea() {
        return (width * length);
    }

    private double faceArea() {
        return (height * width);
    }

    public double surfaceArea() {
        surfaceArea = ((faceArea()) * 2) + ((topArea()) * 2) + ((sideArea()) * 2);
        return surfaceArea;
    }

    private double sideArea() {
        return (height * length);
    }
}