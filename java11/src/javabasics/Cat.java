package javabasics;

public class Cat {
	String colour;
	int leg;
	int eyeno;
	String eyecolour;
	boolean tales;
	String setColour(String s,char ch, int a) {
		return s;
	}
	int getLeg(int a,char ch,String s) {
		return a;	
	}
	int getEyeno(int a,char ch,String s) {
		return a;	
	}

	String setEyecolour(String s,char ch, int a) {
		return s;
	}
	boolean setTales(boolean b,char ch,String s) {
		return b;
		
	}
	
	public static void main(String[] args) {
	Cat c= new Cat();
	String colour=c.colour;
	System.out.println(colour);
	
	int leg=c.leg;
	System.out.println(leg);
	
	int eyeno =c.eyeno;
	System.out.println(eyeno);
	
	String eyecolour= c.eyecolour;
	System.out.println(eyecolour);
	
	boolean tales=c.tales;
	System.out.println(tales);
	
	c.colour="Grey";
	System.out.println(c.colour);
	c.leg=4;
	System.out.println(c.leg);
	c.eyeno=2;
	System.out.println(c.eyeno);
	c.eyecolour="Black";
	System.out.println(c.eyecolour);
	c.tales= true;
	System.out.println(c.tales);
	
	String r1=c.setColour("grey",'a', 1);
	System.out.println(r1);
	int r2=c.getLeg(4,'a',"cat");
	System.out.println(r2);
	int r3=c.getEyeno(2,'a',"cat");
	System.out.println(r3);
	String r4=c.setEyecolour("black",'a', 1);
	System.out.println(r4);
	boolean r5=c.setTales(true,'a',"cat");
	System.out.println(r5);
	}
	

}
