public class CircleExercise {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(8);
		Circle circle3 = new Circle(5, true);
		System.out.println("1. Kreis:\nRadius: "+circle1.getRadius()+"\nUmfang: "+Circle.getCircumference(circle1.getRadius())+
				"\nFlaeche: "+Circle.getArea(circle1.getRadius())+"\n");
		System.out.println("2. Kreis:\nRadius: "+circle2.getRadius()+"\nUmfang: "+Circle.getCircumference(circle2.getRadius())+
				"\nFlaeche: "+Circle.getArea(circle2.getRadius())+"\n");
		System.out.println("3. Kreis:\nRadius: "+circle3.getRadius()+"\nUmfang: "+Circle.getCircumference(circle3.getRadius())+
				"\nFlaeche: "+Circle.getArea(circle3.getRadius())+"\n");
	}

}
