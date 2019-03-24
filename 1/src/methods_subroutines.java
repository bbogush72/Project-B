class Person {

	String name;
	int age;
	

	// classes contain 
	//1-data 
	//2-subroutines (methods)
	
	void speak() {
		for(int i=0; i<2; i++) {
		System.out.println("My name is "+ name + " and I am " + age + " years old ");
		}
	}
	
	void sayHello() {
		
		System.out.println("Hello there!" + name + " How are you, today?" + name + " is very good today");
	}
}

public class methods_subroutines {

	public static void main(String[] args) {

		Person Sahis = new Person();
		Sahis.name = "John";
		Sahis.age = 37;
		Sahis.speak();
		Sahis.sayHello();

		Person Sahis2 = new Person();
		Sahis2.name = "Sarah";
		Sahis2.age = 35;
		Sahis2.sayHello();
		

		Sahis2.speak();
		
		System.out.println(Sahis.name);
		System.out.println(Sahis.age);
		System.out.println("-------------------------------------");

		System.out.println(Sahis2.name);
		System.out.println(Sahis2.age);
	}
}
