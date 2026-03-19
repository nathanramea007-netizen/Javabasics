package Second;

public class constructor {

	public int now;
	public float point;
	public double avg;
	
	public constructor(int a) {
		now = a;
	}
	public constructor(float b) {
		point = b;
	}
	public constructor(double c) {
		avg = c;
	}
	public int now() {
		return now;
	}
	public float point() {
		return point;
	}
	public double avg() {
		return avg;
	}
	
	public static void main(String[] args) {
		double c = 56;
		constructor s2= new constructor(c);
		System.out.println(s2.avg());
	}

	
}
