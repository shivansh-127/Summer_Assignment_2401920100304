package Week_4.OOPS;

class Box {

     double length;
     double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

class Box3D extends Box {

    private double height;

    // Constructor
    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }
}

public class Main2 {
    public static void main(String[] args) {
          Box box = new Box(10, 5);
        System.out.println("Area = " + box.area());
        Box3D box3d = new Box3D(10, 5, 8);
        System.out.println("Area = " + box3d.area());
        System.out.println("Volume = " + box3d.volume());
    }
}
