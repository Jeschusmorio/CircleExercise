public class CircleExercise {

	public static void main(String[] args) {
		CirclePetrovic c1 = new CirclePetrovic();
		CirclePetrovic c2 = new CirclePetrovic(8);
		CirclePetrovic c3 = new CirclePetrovic(5, true);
		CirclePetrovic c4 = new CirclePetrovic("DerEinzigWahreKreis");
		String cName;
		
		//Circle 1:
		cName = c1.output(c1.getName());
		System.out.println(cName+":\nRadius: "+c1.getRadius());
		c1.output(c1.getFilled());
		
		//Circle 2:
		cName = c2.output(c2.getName());
		System.out.println(cName+":\nRadius: "+c2.getRadius());
		c2.output(c2.getFilled());
		
		//Circle 3:
		cName = c3.output(c3.getName());
		System.out.println(cName+":\nRadius: "+c3.getRadius());
		c3.output(c3.getFilled());
		
		//Circle 4:
		cName = c4.output(c4.getName());
		System.out.println(cName+":\nRadius: "+c4.getRadius());
		c4.output(c4.getFilled());
	}

}
