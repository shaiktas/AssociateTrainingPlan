package Inheritance;

class Person {
	String name;
	String address;
	
	public Person() {
		this.name = "John";
		this.address = "";
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
}

class Student extends Person {
	String program;
	int year;
	int fees;
	
	public Student() {
		super();
		this.program = "";
		this.year = 2020;
		this.fees = 0;
	}
	
	public Student(String program, int year, int fees) {
		super();
		this.program = program;
		this.year = year;
		this.fees = fees;
	}
	
	public Student(String name, String address, String program, int year, int fees) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fees = fees;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public int getFees() {
		return fees;
	}
}

class Staff extends Person {
	String school;
	int pay;
	
	public Staff() {
		super();
		this.school = "";
		this.pay = 0;
	}
	
	public Staff(String school, int pay) {
		super();
		this.school = school;
		this.pay = pay;
	}
	
	public Staff(String name, String address, String school, int pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int getPay() {
		return pay;
	}
}

public class personDemo {

	public static void main(String[] args) {
		Person person = new Person("Jonah", "123 Address Ln");
		System.out.println(String.format("A person named %s living at %s", person.getName(), person.getAddress()));
		
		Student student = new Student("Math", 2021, 2000);
		System.out.println(String.format("A student named %s, living at %s, is in the %d %s program and has fees of %d", 
				student.getName(), student.getAddress(), student.getYear(), student.getProgram(), student.getFees()));
		
		Staff staff = new Staff("Dan", "111 Infosys Dr", "Infosys", 65000);
		System.out.println(String.format("A staff member named %s, living at %s, works at %s with a pay of %d", 
				staff.getName(), staff.getAddress(), staff.getSchool(), staff.getPay()));
	}

}
