package Second;
import java.util.Arrays;

public class Array_try {
	
//	public static void main(String [] args){
//	int[] a = {0,1,2,3,4,5,6,7,8,9,10};	
//	int start = 0;
//	int end = a.length -1 ;
//	
//	while(start < end) {
//	int temp = a[start];
//		a[start] = a[end];
//		a[end] = temp;
//		start++;
//		end--;
//	}
//	
//	
//	System.out.println(Arrays.toString(a));
//	
//		}
	
	public static void main(String[] args) {
		String [] a = {"right","left","front","back"};
		int start = 0;
//		int b = a.length-1;
		int end =a.length-1;
		
		while(start<end) {
			String c = a[start];
			a[start]=a[end];
			a[end]=c;
			start++;
			end--;			
		}		
		System.out.println(Arrays.toString(a));	
	}
	}

public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6,7,8,9};
	int b= a.length-1;
	int start =0;
	int end =b;
	
	while(start<end) {
	int c= a[start];
	a[start]=a[end];
	a[end]=c;
	start++;
	end--;
	
	}
	
}

