package Second;



public class Tryinheri2 extends Tryinheri1{
	public int area1;
	public float point1;
	public Tryinheri2(int v) {
		area1 =v;
	}
	public Tryinheri2(float u) {
		point1 =u;
	}
	public int area1(){
		return area1;
	}
	public float point1(){
		return point1;
	}
	public static void main(String[] args) {
		Tryinheri2 T2 = new Tryinheri2(2.3f);
		System.out.println(T2.point1());
		
		
	}

}
