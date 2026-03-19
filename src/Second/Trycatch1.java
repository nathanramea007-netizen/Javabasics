package Second;
import java.util.*;


public class Trycatch1  {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("enter first number1");
		int a =sc.nextInt();
		System.out.println("enter first number2");
		int b = sc.nextInt();
		if(a/b==0) {
			System.out.print("VALID");
		}
	}
	catch (ArithmeticException e) {
		System.out.print("invalid data");
	}
		
	
	
	}
}
