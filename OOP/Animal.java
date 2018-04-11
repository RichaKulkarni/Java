/* Instructions for exercise:
 * 
 * In zoo class, define main method
 * In animal class, define general attributes
 * age, gender, weight in pounds,
 * define behaviors like eat/sleep
 * create 3 instances of animals (3 animal objects in zoo main method
 * create 2 other classes like bird, and fish and create their objects in zoo class too
 */

public class Animal {
	
	//Define attributes of class
	String name;
	String type;
	int age;
	String gender;
	int weightInPounds;
	
	//Define dynamic constructor. Instructions on how an animal object should be created
	public Animal(String name, String type, int age, String gender, int weightInPounds){
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.gender = gender;
		this.weightInPounds = weightInPounds;
	}
	
	//action methods
	public void speak(){
		System.out.println("Hello, my name is " + name);
		System.out.println("I am an animal of type " + type);
		System.out.println("I am " + age + " years old");
		System.out.println("I am a " + gender);
		System.out.println("I weigh " + weightInPounds + " pounds");
	}
	
	public void sleep(){
		System.out.println("I am sleeping...");
	}
	
	public void eat(){
		System.out.println("I am eating...");
	}
}
