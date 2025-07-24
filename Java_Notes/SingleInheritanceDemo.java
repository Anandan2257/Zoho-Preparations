public class SingleInheritanceDemo{
	public static void main(String ...a){
		int x=10;
		PuppyDog dog=new PuppyDog();
		dog.eat();
		dog.barks();
		Cat cat=new Cat();
		cat.eat();
		cat.meow();
	}	
}
class Animal{
	String color;
	boolean isDomestic;  //true-pet false-wildAnimal

	void eat(){
		System.out.println("Eating....");
	}

	void drinksWater(){
	}
}

class Dog extends Animal{
	static boolean isLoyal=true;

	Dog(){
		System.out.println("Dog class...");
	}
	void barks(){
		System.out.println("Dog barking....");
	}
}
class Cat extends Animal{
	void meow(){
		System.out.println("Cat meows....");
	}
}
class PuppyDog extends Dog{
	void weep(){
		System.out.println("Puppy Dog weeping...");
	}
}