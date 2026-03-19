package Second;
import java.util.Scanner;

public class Try4 {

		public void  print(String a) {
			System.out.println("");
		}
		
	public static void main(String [] args) {
		
		Try4 t = new Try4();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String a = sc.nextLine();
		System.out.println("Enter your age");
		int b= sc.nextInt();
		t.print(a);
		
		System.out.print(a+b);
		
		
		
	}
	}


