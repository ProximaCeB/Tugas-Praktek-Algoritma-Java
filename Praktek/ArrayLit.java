import java.util.ArrayList;
public package Praktek;

class ArrayLit {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo"); cars.add("BMW");
		cars.add("Ford"); cars.add("Mazda");
		for (int i = 0; i < cars.size(); i++) 
			{ System.out.println(cars.get(i));}
		System.out.println( "----------------" );
		cars.remove("BMW");
		cars.add("Toyota");
		cars.remove(cars.get(0));
		for( String c: cars )
			{ System.out.println( c );}
	}
}