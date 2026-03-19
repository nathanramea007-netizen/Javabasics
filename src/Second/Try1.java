package Second;

public class Try1 {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void sub(int x,int y) {
		int d=x-y;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Try1 s=new Try1();
		sub(15,7);
		s.add(6,7);
		
	}
	
}

