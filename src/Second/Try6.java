package Second;

public class Try6 {
	public Try6() {
	}
	

public Try6(float a) {	
	}
	
	
	public static void main(String [] args) {
		int a = 56;
		int b= 67;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		Try6 t = new Try6();
	
		t.left();
	}
	public int right() {
		int a = 15;
		int b = 25;
		System.out.println(a+b);
		return a;
	}
	public String left() {
		String c ="pen";
		String d ="pencil";
		System.out.println(c+d);
		return c;
	}
	public float straight() {
		float e = 2.5f;
		float f = 3.5f;
		System.out.println(e+f);
		return f;
	}
	public double back() {
		int g = 22;
		int h = 33;
		System.out.println(g+h);
		return g+h;
	}
	
}
