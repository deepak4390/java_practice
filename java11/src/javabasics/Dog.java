package javabasics;

public class Dog {
	String name;
	String colour;
	int eye;
	String eyecolour;
	int leg;
	String character;
	
	String getName(String s,char ch,boolean b) {
		return s;
	}
	String setColour(String s,char ch,boolean b) {
		return s;
	}
	int getEye(int a,char ch,String s) {
		return a;
	}
	String setEyecolour(String s,int a,char ch) {
		return s;
	}
	int getLeg(int a,String s,float f) {
		return a;
	}
	String setCharacter(String s,char ch, int a) {
		return s;
	}
	
	public static void main(String[] args) {
		Dog d= new Dog();
		String name=d.name;
		System.out.println(name);
		
		String colour= d.colour;
		System.out.println(colour);
		
		int eye= d.eye;
		System.out.println(eye);
		
		String eyecolour=d.eyecolour;
		System.out.println(eyecolour);
		
		int leg=d.leg;
		System.out.println(leg);
		
		String character=d.character;
		System.out.println(character);
		
		d.name="Rofu";
		System.out.println(d.name);
		d.colour="White";
		System.out.println(d.colour);
	  d.eye=2;
	  System.out.println(d.eye);
	  d.eyecolour="Black";
	  System.out.println(d.eyecolour);
	  d.leg=4;
	  System.out.println(d.leg);
	  d.character="faithful";
	  System.out.println(d.character);
	  
	  String r1=d. getName("Puppy",'a',true);
	  System.out.println(r1);
	  String r2=d. setColour("Redbrown",'a',true);
	  System.out.println(r2);
	  int r3=d.getEye(2,'a',"two");
	  System.out.println(r3);
	  String r4=d.setEyecolour("black",2,'a');
	  System.out.println(r4);
	  int r5=d.getLeg(4,"leg",10);
	  System.out.println(r5);
	  String r6=d.setCharacter("faithful",'d', 1);
	  System.out.println(r6);
	}

}
