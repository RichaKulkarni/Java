
public class Fish {

	//define default attributes
	String name;
	int bodyLengthInInches;
	String color;
	
	//define constructor
	public Fish(String name, int bodyLengthInInches, String color){
		super();
		this.name = name;
		this.bodyLengthInInches = bodyLengthInInches;
		this.color = color;
	}
	
	//action methods
	public void fishInfo(){
		System.out.println("I'm a fish and my name is " +name);
		System.out.println("I am " +bodyLengthInInches+ " inches long");
		System.out.println("I am " +color);
	}
	
	public void swim(){
		System.out.println("I am swimming...");
	}
}
