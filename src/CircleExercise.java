public class CircleExercise {

	public static void main(String[] args) {
		CirclePetrovic c1 = new CirclePetrovic();
		CirclePetrovic c2 = new CirclePetrovic(8);
		CirclePetrovic c3 = new CirclePetrovic(5, true);
		CirclePetrovic c4 = new CirclePetrovic("DerEinzigWahreKreis");
		Circle c5 = new Circle(7, true);
		c1.output();
		c2.output();
		c3.output();
		c4.output();
		c5.output();
	}

}
