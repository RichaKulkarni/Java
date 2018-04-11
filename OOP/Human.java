//Class will allow us to create objects of type Human. Class is a specification/
//blueprint of how objects should be created and how they should behave. We can
//use the Human class to create many human objects. The human objects in our 
//application will have age, name height, eyecolor attributes. 
public class Human {

	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	//special method = constructor. allows us to create objects of type human.
	//constructor method doesn't have a return type. constructor methods always
	//have the same name as the class. you don't have to explicitly define it since
	//a default constructor comes with the class, but we will define it here
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		//this keyword is a variable in java. it points to the current object.
		//this points to current instance of object
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	
	
	//all human objects in our application will be able to conduct these 4 basic
	//behaviors. Humans will not be sleep or swim since we have not defined those
	//actions in our class
	public void speak(){
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " +heightInInches + " inches tall");
		System.out.println("I am "+ age + " years old");
		System.out.println("My eye color is " + eyeColor);
	}
	

	public void eat(){
		System.out.println("eating...");
	}
	
	public void walk(){
		System.out.println("walking...");
	}
	
	public void work(){
		System.out.println("working...");
	}
	
}
