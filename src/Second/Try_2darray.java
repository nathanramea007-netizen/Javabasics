package Second;
import java.util.*;
public class Try_2darray {
	public static void main(String[] args) {
//		String[] arr= {"A","B","C","D","E"};
//		int a= arr.length;
//		for(int i=0; i<a; i++) {
//		 String b = arr[i];
//		 for(int c=0; c<=i; c++) {
//			 System.out.print(arr[i]);
//		 }
//		 System.out.println();
//		 }
//		String[] a= {"*", "*", "*", "*", "*"};
//		int b= a.length;
//		for (int i=0; i<5; i++) {
//			String c =a[i];
//		for (int d=1; d<=i; d++) {
//			System.out.print(d);	
//		}
//		System.out.println();
//		}
//		String[] a= {"*", "*", "*", "*", "*"};
//		int b= a.length;
//		for (int i=0; i<b; i++) {
//			String c= a[i];
//		for (int d=0; d<=i; d++) {
//			System.out.print(c);
//			
//		}
//		System.out.println();
		int[][] a = {
	            {3, 5, 1, 9},
	            {10, 15, 3, 0},
	            {1, 11, 31, 90},
	            {2, 51, 1, 9} };
		int lar=20;
		int b= a.length;
		 	for (int i=0; i<b; i++) {
		 		int[] c =a[i];
		 	for (int d=0; d<c.length; d++) {
		 		
		 		if(lar<a[i][d]) {
		 			lar = a[i][d];
		 			System.out.println(d);	 			
		 	   }		
		 	}		
		}
	}
}
