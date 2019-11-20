public class CirclePetrovic extends Circle {
	private String name;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		if (getName().length() < 1) {
			setName("Petrovic");
		}
	}
}
