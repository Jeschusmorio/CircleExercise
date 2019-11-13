public class Circle {
	private static double radius;
	private static boolean filled;
	
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
	public static double getCircumference(double radius) {
		return 2 * SomeMaths.pi * radius;
	}
	public static double getArea(double radius) {
		return SomeMaths.pi * SomeMaths.getSquared(radius);
	}
	public static double getRadius() {
		return radius;
	}
	public static void setRadius(double radius) {
		Circle.radius = radius;
		if (getRadius() < 1) {
			Circle.radius = 1;		//set radius to default value 1
		}
	}
	public static boolean getFilled() {
		return filled;
	}
	public static void setFilled(boolean filled) {
		Circle.filled = filled;
	}
}
