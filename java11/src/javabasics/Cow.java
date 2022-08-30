package javabasics;

public class Cow {
	String name;
	int leg;
	String colour;
	int ear;
	String tail;
	int milk;
	String meal;
	
	String setName(String s,char ch, boolean b) {
		return s;
		
		}
	int setLeg(String s, int i,float f) {
		return i;
	}
	String setColour(String s, char ch) {
		return s;
	}
	int setEar(String s, int i,float f) {
		return i;
	}
	String setTale(String s, char ch) {
		return s;
	}
	int setMilk(int a,String s, char ch) {
		return a;			
	}
	String setMeal(String s, char ch) {
		return s;
	}
	
	
	public static void main(String[] args) {
		Cow c=new Cow();
		String name=c.name;
		System.out.println(name);
		
		int leg=c.leg;
		System.out.println(leg);
		
		String colour=c.colour;
		System.out.println(colour);
		
		int ear=c.ear;
		System.out.println(ear);
		
		String tail=c.tail;
		System.out.println(tail);
		
		int milk=c.milk;
		System.out.println(milk);
		
		String meal=c.meal;
		System.out.println(meal);
		System.out.println();
		
		c.name="Laxmi";
		System.out.println(c.name);
		c.leg=4;
		System.out.println(c.leg);
		c.colour="dapple";
		System.out.println(c.colour);
		c.ear=2;
		System.out.println(c.ear);
		c.tail="long";
		System.out.println(c.tail);
		c.milk=6;
		System.out.println(c.milk);
		c.meal="chara";
		System.out.println(c.meal);
		
		String r1=c.setName("Laxmi",'a', true);
		System.out.println(r1);
		int r2=c.setLeg("leg", 4,1);
		System.out.println(r2);
		int r3=c.setEar("ear", 2,1);
		System.out.println(r3);
		String r4=c.setTale("long", 'c');
		System.out.println(r4);
		int r5=c.setMilk(6,"cow", 'a');
		System.out.println(r5);
		String r6=c.setMeal("chara", 'c');
		System.out.println(r6);
	}
	

}
