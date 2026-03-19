package Second;

public class Student {
	public Student() {	
		System.out.println("empty");
	}
	
	
	public int age; // global 
	public int name;
	
	public Student (int a, int b) {
		age =  a;
		name = b;
	
    }
	
	
	public static void main(String [] args) {
		Student s1 = new Student(35,35);

		
		System.out.println(s1.age);
	
	}

}



