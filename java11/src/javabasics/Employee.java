package javabasics;

public class Employee {// class
	int empid;// variable declare
	String name;
	String department;
	int age;
	char gender;
	double salary;
	int phone;
	String city;
	String state;
	boolean ismarried;
	char section;
	static int empid1;
	static String name1;
	static int a;

	String read(String s, char ch) {
		return s;
	}// method

	int setEmpid(int a, String s, double d) {
		return a;
	}

	String setName(String s, char ch) {
		return s;
	}

	String getDepatment(String s, char ch) {
		return s;
	}

	int getAge(int a, String s, double d) {
		return a;
	}

	char setGender(char ch, String s) {
		return ch;
	}

	double setSalary(double d, float f, String s) {
		return d;
	}

	int getPhone(int a, String s, double d) {
		return a;
	}

	String getCity(String s, char ch) {
		return s;
	}

	String getState(String s, char ch) {
		return s;
	}

	boolean setMarried(boolean b, String s, char ch) {
		return b;
	}

	char getSection(String s, char ch) {
		return ch;
	}

	public static void main(String[] args) {// main method
		Employee e = new Employee();// object
		int id = e.empid;// variable define
		System.out.println(id);

		String name = e.name;
		System.out.println(name);

		String depatment = e.department;
		System.out.println(depatment);

		int age = e.age;
		System.out.println(age);

		char gender = e.gender;
		System.out.println(gender);

		double salary = e.salary;
		System.out.println(salary);

		int phone = e.phone;
		System.out.println(phone);

		String city = e.city;
		System.out.println(city);

		String state = e.state;
		System.out.println(state);

		boolean ismarried = e.ismarried;
		System.out.println(ismarried);

		char section = e.section;
		System.out.println(section);
		System.out.println();

		e.empid = 1234;// in variable value assign
		System.out.println(e.empid);
		e.name = "Deepak";
		System.out.println(e.name);
		e.department = "IT";
		System.out.println(e.department);
		e.age = 27;
		System.out.println(e.age);
		e.gender = 'M';
		System.out.println(e.gender);
		e.salary = 25000;
		System.out.println(e.salary);
		e.phone = 122456;
		System.out.println(e.phone);
		e.city = "Nalanda";
		System.out.println(e.city);
		e.state = "Bihar";
		System.out.println(e.state);
		e.ismarried = true;
		System.out.println(e.ismarried);
		e.section = 'a';
		System.out.println(e.section);
		System.out.println();

		String r1 = e.read("Deepak", 'a');
		System.out.println(r1);
		int r2 = e.setEmpid(3, "a", 50);// method call or invocation
		System.out.println(r2);
		String r3 = e.setName("Deepak", 'a');
		System.out.println(r3);
		String r4 = e.getDepatment("compuerscience", 'b');
		System.out.println(r4);
		int r5 = e.getAge(24, "age", 27);
		System.out.println(r5);
		char r6 = e.setGender('M', "male");
		System.out.println(r6);
		double r7 = e.setSalary(55, 10, "full");
		System.out.println(r7);
		int r8 = e.getPhone(9711, "phone", 20);
		System.out.println(r8);
		String r9 = e.getCity("Nalanda", 'a');
		System.out.println(r9);
		String r10 = e.getState("Bihar", 'a');
		System.out.println(r10);
		boolean r11 = e.setMarried(true, "hello", 'y');
		System.out.println(r11);
		char r12 = e.getSection("aim", 'a');
		System.out.println(r12);
	}

}
