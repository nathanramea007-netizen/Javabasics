package Second;
import java.util.Arrays;


public class Array_try1 {
	public static void main(String[] args) {
		int[]a = {4,5,6,7,8,9};
		int b = a.length-1;
		int large =0;
		int sum = 0;
		for(int i=0; i<b; i++) {
			sum= sum+a[i];		
		}
		
		float avg = sum  / a.length;
		
		System.out.println(avg);
	}

}
