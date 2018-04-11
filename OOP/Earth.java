
public class Earth {

	//this method is the entry point for all Java applications. code is executed
	//sequentially (line by line) inside this method.
	public static void main(String[] args) {
		
		//create three different human objects
		//human1 is instance
		Human human1 = new Human("Tom", 25, 76, "Blue");
		Human human2 = new Human("Joe", 28, 68, "Green");
		
		human1.speak();
		human2.speak();
		
		
		
		
//		//define variable of type Human. tom = instance variable
//		Human tom;
//		//assign to variable a new Human object by calling the constructor method
//		tom = new Human();
//		
//		//assign field values for tom the human object
//		tom.age = 5;
//		tom.eyeColor = "brown";
//		tom.heightInInches = 72;
//		tom.name = "Tom Zsabo";
//		
//		//make tom the human object speak
//		tom.speak();
//		
//		//create new human object, Joe
//		Human joe = new Human();
//		
//		//assign field values for joe the human object
//		joe.age = 36;
//		joe.eyeColor = "Green";
//		joe.heightInInches = 68;
//		joe.name = "Joe Greensilk";
//		
//		//make joe the human object speak;
//		joe.speak();
	}

}
