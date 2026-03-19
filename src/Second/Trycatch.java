package Second;
import java.util.*;

public class Trycatch {
	public static void main (String [] args) {
	 Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter a number");
			int a =sc.nextInt();
		}
		
		catch (Exception e) {
			System.out.println("enter number is not correct");
		}
		
		finally {
			System.out.println("ok");
		}
	}
	}
	


