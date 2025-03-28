[12:24, 3/28/2025] Beyda  Eren : public class Shape {

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
[12:24, 3/28/2025] Beyda  Eren : public class Triangle extends Shape {

	private int sideA, sideB, sideC;

	public Triangle(Point sideA, int sideB, int sideC) {
		super(sideA);
		setSideB(sideB);
		setSideC(sideC);
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
			this.sideB = 0;
			System.out.println("Side B can't be negative!!");
		} else {
			this.sideB = sideB;
		}
	}

	public int getSideC() {
		return sideC;
	}
	public void setSideC(int sideC) {
		if (sideC < 0) {
			this.sideC = 0;
			System.out.println("Side C can't be negative!!");
		} else {
			this.sideC = sideC;
		}
	}

	@Override
	public double area() {
		return this.sideA*this.sideB/2;
	}

	@Override
	public double perimeter() {
		return this.sideA+this.sideB+this.sideC;
	}

	@Override
	public String toString() {
		return "Triangle{" +
				"sideA=" + sideA +
				", sideB=" + sideB +
				", sideC=" + sideC +
				'}';
	}
}