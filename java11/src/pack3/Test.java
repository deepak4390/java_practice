package pack3;
/**
 * 
 */
import pack1.pack2.Cat;
import  static pack1.pack2.Rat.run;
import pack1.pack2.Dog;
import pack1.pack2.Lion;
//import pack1.pack2.Cow;
import  static pack1.pack2.Cow.eat;
import  static pack1.pack2.Cat.walk;
import  static java.lang.System.out;
public class Test {
	public static void main(String[] args) {
		pack1.Student s= new pack1.Student();
		pack2.Teacher t= new pack2.Teacher();
		s.m1();
		t.m2();
		//pack1.pack2.Dog d= new pack1.pack2.Dog();
		Dog d=new Dog();
		d.m3();
		//Rat r=new Rat();
		Cat c= new Cat();
		//pack1.pack2.Cow.eat();
		//Cow.eat();
		eat();
		walk();
		run();
		System.out.println("Deepak");
		out.println("Bhushan");
		Lion l = new Lion();
		l.m5();

	}
}
