package Second;
import java.util.*;


public class Namerev {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter name");
//		String a = sc.nextLine();
//		int b = a.length();
//		String newString ="";
		String b="rama";
		
//		
//		for (int i=b; i > 0; i--) {
//			char c = a.charAt(i-1);
//			newString = newString + c;
////			System.out.println(c);
//				}
//		
//		System.out.println(newString);
//		
		String name = "Java";
        String reversed = "";

        // Start from the last index and move to the first
        for (int i = name.length()- 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }

			
		
		
	}
	


