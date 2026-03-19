package Second;

public class Schooltry1 {
	public  String name;
	public float points;
	public double no;
	
	public Schooltry1(String a) {
		name = a;
	}
	public Schooltry1(float b) {
//		System.out.print("caleed float" + b);
		points = b;
	}
	public Schooltry1(double c) {
		System.out.print("caleed\n" + c);
		no = c;
	}
	public String name() {
		return name;
	}
	public float points() {
		return points;
	}
	public double no() {
		return no;
	}
	
	public static void main(String [] args) {
		 float a  = 22.3f;
		 double b = 300;
//		Schooltry1 s =  new Schooltry1("soap");
//		Schooltry1 s1 = new Schooltry1(5.5f);
		Schooltry1 s2 = new Schooltry1(b);
//		System.out.println(s.name());
//		System.out.println(s1.points());
		System.out.println(s2.points());
	}
}
