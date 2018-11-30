
public class Student {
	private String name;
	private int age;
	private double grade;
	
	public Student(String name,int age,double grade) {
		this.age=age;
		this.grade=grade;
		this.name=name;		
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}
