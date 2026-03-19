package Second;
abstract class position{
	
	
	
	public String right() {
		return "a";	
	}
	public int position1(){
		return 34;
	}
	abstract String right1();
	abstract int position11();
	
	
}

public class Try_abstract extends position{
	@Override
	public String right1() {
		return "a";
	}
	@Override
	public int position11(){
		return 34;
	}
	
		public static void main (String [] args){
			position t1 = new Try_abstract();
			System.out.println(t1.right1());
		}
}
