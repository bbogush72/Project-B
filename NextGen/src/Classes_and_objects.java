class Person {
	
	String name;
	int age;
	
	//classes contain 1-data 2-subroutines (methods)
}
public class Classes_and_objects {

	public static void main(String[] args) {
		
		Person Sahis = new Person();
		Sahis.name = "Ahmet Durmaz";
		Sahis.age = 37;
		
		Person Sahis2 = new Person();
		Sahis2.name = "Mehmet Durmaz";
		Sahis2.age = 35;
		
		
		System.out.println(Sahis.name);
		System.out.println(Sahis.age);
		System.out.println("-------------------------------------");
		
		System.out.println(Sahis2.name);
		System.out.println(Sahis2.age);
		
		
	}

}
