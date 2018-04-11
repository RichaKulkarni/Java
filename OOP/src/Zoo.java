
public class Zoo {
	
	public static void main(String[] args) {
		//new instance lion of Animal type
		//simba is not an object because objects are a runtime concept
		Animal simba = new Animal("Simba", "Lion", 10, "Male", 200);
		simba.speak();
		simba.eat();
		//another instance of Animal type
		Animal nala = new Animal("Nala", "Lion", 9, "Female", 150);
		nala.speak();
		nala.eat();
		
		//new instance koi of Fish type
		Fish koi = new Fish("Koi", 20, "Orange");
		koi.fishInfo();
		
		//new instance zazu of Bird type
		Bird zazu = new Bird("Zazu", "Hornbill", "Blue-Red-Orange");
		zazu.birdInfo();
	}

}
