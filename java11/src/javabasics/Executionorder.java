package javabasics;
/**java compiler compile top to bottom line by line
 * all static variables and block(FCFS)
 * in static no need to create an object
 * instance variables and block(FCFS)
 * in instance Compulsory create an object
 * constructor
 * 
 * 
 * 
 *
 */
public class Executionorder {
	static {
		System.out.println("static block2");
	}
	int a = 10;
	int b = m1();
	{ 
		System.out.println("Instance block");
	}
	static int c;
	static int d = m2();
	static {
		System.out.println("static block");
	}

	public int m1() {
		System.out.println(b);
		return 20;
	}

	public static int m2() {
		System.out.println(d);
		return 30;
	}

	Executionorder() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		Executionorder e=new Executionorder();
	}

	{
		System.out.println(b);
	}
	static {
		System.out.println(d);
	}

}
