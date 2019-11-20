public class Circle {
	private double radius;
	private boolean filled;
	
	Circle() {
		this(1.0, false);
	}
	Circle(double radius) {
		this(radius, false);
	}
	Circle(double radius, boolean filled) {
		setRadius(radius);
		setFilled(filled);
	}
	public double getCircumference(double radius) {
		return 2 * SomeMaths.pi * radius;
	}
	public double getArea(double radius) {
		return SomeMaths.pi * SomeMaths.getSquared(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
		if (getRadius() < 1) {
			setRadius(1);		//set radius to default value 1
		}
	}
	public boolean getFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//HÜ: Neue Klasse Petrovic Circle vererbt von Circle mit zus. Attribut name
	//S. 77 super (Aufruf von parent Konstruktoren)
	
}
