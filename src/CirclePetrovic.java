public class CirclePetrovic extends Circle {
	private String name;
	
	//Default Konstruktor
	public CirclePetrovic() {
		this(1.0, false, "");
	}
	public CirclePetrovic(String name) {
		this(1.0, false, name);
	}
	public CirclePetrovic(double radius) {
		this(radius, false, "");
	}
	public CirclePetrovic(double radius, boolean filled) {
		this(radius, filled, "");
	}
	public CirclePetrovic(double radius, boolean filled, String name) {
		super(radius, filled);
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		/*if (name.length() < 1) {
			System.out.println("Der Name darf nicht leer sein!");
			setName("Petrovic");
		} 
		else {
			this.name = name;
		}*/
		this.name = name;
	}
	public String output(String name) {
		if (getName() == "") {
			return "Kreis";
		}
		else {
			return this.name;
		}
	}
}
