public class Circle {
	private double radius;	//hat standardm‰ﬂig den Wert null
	private boolean filled;	//hat standardm‰ﬂig den Wert false
	
	//Default-Konstruktor
	public Circle() {
		this(1.0, false);
	}
	public Circle(double radius) {
		this(radius, false);
	}
	public Circle(double radius, boolean filled) {
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
		if (radius < 1) {
			System.out.println("Radius muss mindestens den Wert 1 besitzen!");
			setRadius(1.0);		//set radius to default value 1
		}
		else {
			this.radius = radius;
		}
	}
	public boolean getFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//H‹: Neue Klasse Petrovic Circle vererbt von Circle mit zus. Attribut name
	//S. 77 super (Aufruf von parent Konstruktoren)
	
}
