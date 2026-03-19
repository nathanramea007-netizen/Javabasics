package Second;
import java.util.*;

public class Try8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String a = sc.nextLine();
		
			
			int b= a.length();
			String ad = "";
			
			for (int i=b; i>0; i--) {
				char c= a.charAt(i-1);
				ad = ad+c;

				
//				System.out.println(ad);
			}
			
			if(a.equals(ad)){
				System.out.println("paralindrome");	
			}
			
			else{
				System.out.println("not paralindrome");	
	}
	}

	}
