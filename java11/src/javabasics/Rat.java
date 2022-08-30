package javabasics;

public class Rat { //class
	int leg;// variable
	String Colour;
	int teeth;
	String tale;
	
	public static void main(String[] args) { //method
		Rat r=new Rat();// object
		System.out.println(r.leg);
		System.out.println(r.Colour);
		System.out.println(r.teeth);
		System.out.println(r.tale);
		System.out.println();
		r.leg=4;//object test
		r.Colour="black";
		r.teeth=12;
		r.tale="long";
		System.out.println(r.leg);
		System.out.println(r.Colour);
		System.out.println(r.teeth);
		System.out.println(r.tale);
	}
	

}
