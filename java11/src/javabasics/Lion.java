package javabasics;

public class Lion {
	static String name;
	static int leg;
	static String hunting;
	static char cruel;
	static String meal;
	static int eye;
	static boolean tail;
	static int claws;
	static float stand;
	static double age;
	
	static String getName(String s,char ch) {
		return s;
	}
	static int setLeg(int i,String s) {
		return i;
	}
	static String getHunting(String s,char ch) {
		return s;
	}
	static char setCruel(String s,char ch) {
		return ch;
	}
	static String getMeal(String s,char ch) {
		return s;
	}
	static int setEye(int i,String s) {
		return i;
	}
	
	static boolean setTail(boolean b,String s) {
		return b;
	}
	static int setClaws(int i,String s) {
		return i;
	}
	static float setStand(float f,String s) {
		return f;
	}
	static double setage(double d,String s) {
		return d;
	}
	public static void main(String[] args) {
		//System.out.println("Sheru");
		//System.out.println(4);
		//System.out.println("Deer");
		//System.out.println('c');
		//System.out.println("flesh");
		//System.out.println(2);
		//System.out.println(true);
		//System.out.println(4);
		//System.out.println(2.0);
		//System.out.println(20);
		//System.out.println();
		
String name = getName("hello", 'A');
System.out.println(name);
int leg=setLeg(4,"lion");
System.out.println(leg);
String hunting = getHunting("deer",'l');
System.out.println(hunting);
 char cruel= setCruel("lion",'l');
 System.out.println(cruel);
 String meal = getMeal("flesh",'f');
 System.out.println(meal);
 double age=setage(2,"eye");
 System.out.println(age);
  int setEye = setEye(2,"eye");
  System.out.println(setEye);
  boolean setTail = setTail(true,"tail");
  System.out.println(setTail);
  int setClaws=setClaws(4,"claws");
 System.out.println(setClaws);
 float setStand=setStand(2,"height");
 System.out.println(setStand);

	}
	
	
	}