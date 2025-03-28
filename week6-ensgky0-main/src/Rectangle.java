public class Rectangle extends Shape {



    private int sideA , sideB;

    public static int counter = 0;

    public int counterForObject=0;

    public Rectangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);
        counter ++;
        counterForObject++;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            throw new IllegalArgumentException("Side cant be negative");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.si…
public class Shape {

                private Point location;

                public Shape(Point location) {
                    this.location = location;
                }

                public Point getLocation() {
                    return location;
                }

                public void setLocation(Point location) {
                    this.location = location;
                }

                public double area(){
                    return 0;
                }

                public double perimeter(){
                    return 0;
                }

                @Override
                public String toString() {
                    return "Shape{" +
                            "location=" + location +
                            '}';
                }
            }