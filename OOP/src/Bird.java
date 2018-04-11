
public class Bird {
	//define attributes
	String name;
	String type;
	String color;
	
	//define dynamic constructor
	public Bird(String name, String type, String color){
		super();
		this.name = name;
		this.type = type;
		this.color = color;
	}
	
	//define action methods
	public void birdInfo(){
		System.out.println("My name is " +name);
		System.out.println("I am " + type + " type of bird");
		System.out.println("I am " +color);
	}
	
	public void fly(){
		System.out.println("flying...");
	}
	
}
