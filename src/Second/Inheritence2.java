package Second;

public class Inheritence2 extends Inheritence1{
	
	public int age;
	public String name;
	public float point;
	
	public Inheritence2(int i) {
		super(i);
		age =i;
	}

	public Inheritence2(float k) {
		super(k);
		point =k;
	}
	public int age() {
		return age;
	}
	
	public float point() {
		return point;
	}
	
	
	public static void main(String[] args) {
		
		Inheritence2 T2 = new Inheritence2(24);
		System.out.println(T2.no);
	}

}

