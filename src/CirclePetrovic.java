public class CirclePetrovic extends Circle {
	private static String name;
	
	CirclePetrovic() {
		this(1.0, false, "Petrovic");
	}
	CirclePetrovic(double radius) {
		this(radius, false, "Petrovic");
	}
	CirclePetrovic(double radius, boolean filled) {
		this(radius, filled, "Petrovic");
	}
	CirclePetrovic(double radius, boolean filled, String name) {
		super(radius, filled);
		setName(name);
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		CirclePetrovic.name = name;
		if (getName().length() < 1) {
			CirclePetrovic.name = "Petrovic";
		}
	}
}
