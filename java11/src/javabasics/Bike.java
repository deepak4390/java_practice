package javabasics;

public class Bike {//class
	String splendor;//variable
	int tyre;
	int mirror;
	String frontbrake;
	String rearbrake;
	int indicator;
	float speedometer;
	float fuelmeter;
	double speed;
	char chawk;
	boolean sensor;
	String getsplendor(String s,int i) { //method body
		return s;
	}
	int getTyre(int i,String s){
		return i;
	}
	int setMirror(int i,String s) {
		return i;
	}
	String getfrontbrake(String s,char ch) {
		return s;
	}
	String getreartbrake(String s,char ch) {
		return s;
	}
	int settIndicator(int i,boolean b) {
		return i;
	}
	float checkSpeedometer(float f,double d) {
		return f;
	}
	float checkfuelmeter(float f,String s) {
		return f;
	}
	double getSpeed(double d,int i) {
		return d;
	}
	char checkChawl(char ch,String s) {
		return ch;
	}
	boolean showSensor(boolean b, String s) {
		return b;
	}
	
	
	public static void main(String[] args) {//main method
	Bike b=new Bike(); //object
	
	System.out.println(b.splendor);//test object
	System.out.println(b.tyre);
	System.out.println(b.frontbrake);
	System.out.println(b.rearbrake);
	System.out.println(b.indicator);
	System.out.println(b.speedometer);
	System.out.println(b.fuelmeter);
	System.out.println(b.speed);
	System.out.println(b.chawk);
	System.out.println(b.sensor);
    System.out.println();

    String r=b.getsplendor("splendor+",1); //testing method object
    System.out.println(r);
    int r1= b.getTyre(2,"tyre");
    System.out.println(r1);
    int r2=b.setMirror(4,"mirror") ;
    System.out.println(r2);
	
	
	
	}

}
