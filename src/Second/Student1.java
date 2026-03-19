package Second;

public class Student1 {

	public Student1() {
		
	}
	public int age;
	public Student1(int a) {
	 age = a;
	}
	
	public static void main(String [] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1(55);
		System.out.println(s2.age);
	
	}
}
