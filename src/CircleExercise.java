public class CircleExercise {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("1. Kreis:\nRadius: "+c1.getRadius()+"\nUmfang: "+
				c1.getCircumference(c1.getRadius())+"\nFlaeche: "+c1.getArea(c1.getRadius())+"\n");
		Circle c2 = new Circle(8);
		System.out.println("2. Kreis:\nRadius: "+c2.getRadius()+"\nUmfang: "+
				c2.getCircumference(c2.getRadius())+"\nFlaeche: "+c2.getArea(c2.getRadius())+"\n");
		Circle c3 = new Circle(5, true);
		System.out.println("3. Kreis:\nRadius: "+c3.getRadius()+"\nUmfang: "+
				c3.getCircumference(c3.getRadius())+"\nFlaeche: "+c3.getArea(c3.getRadius())+"\n");
	}

}
