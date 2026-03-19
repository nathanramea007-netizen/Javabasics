package Second;
abstract class A{
	

	public int add() {
		return 50;
	}
	
	abstract int sub();
	abstract int mul();
	abstract int div();

//public class Inheri5 extends A   {
//	private int point;
//	private int value;
//	
////	public Inheri5(int a,int b) {
////		this.point=a;
////		this.point=b;	
////	}\
//	
////	@Override
//	public int add() {
//		return 10 + 20;
//	}
//	
//	public int sub() {
//		return 10 -20;
//	}
//	public int mul() {
//		return 10 * 20;
//	}
//	
//	public static void main(String[] args) {
//	
//		A a = new A();
//		System.out.println(a.add());
//		
//		A a1 = new Inheri5();
//		int res = a1.add();
//		
//	System.out.println(res);	
//	}
//}
	public class Inheri5 extends A {
		
		@Override
		public int sub() {
			return 20;
		}
		
		@Override 
		public int mul() {
			return 0;
		}
		
		@Override
		public int div() {
			return 20;
		}
	
		public int add() {
			return 30;
		}
		public String b() {
			return "adj";
		}
		public static void main (String [] args) {
			A a1 = new A();
			A a2 = new Inheri5();
			
			
			System.out.println(a2.add());
			
			
		}
		
	}
