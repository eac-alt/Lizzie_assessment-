package infiniteTerrain;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game();
		g.addPerson(new Person("Jim", 22, 3, 4));
		g.addPerson(new Person("Ellie", 19, 1, 5));
		g.printPerson();
		g.getLocation(Person.class);
		Person.move();

	}

}
