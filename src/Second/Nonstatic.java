package Second;
import java.util.*;
public class Nonstatic {
	



public static void main(String [] args) {
	Nonstatic t5 = new Nonstatic();
	t5.grass();
}


public int leaf() {
	int a = 45;
	int b=56;
	System.out.println(a+b);
	return a;
}
public String tree() {
	String c = "lion";
	String d = "tiger";
	System.out.println(c+d);
	return c;
}
public int grass() {
	int e = 76;
	int f = 87;
	System.out.println(e+f);
	return e;
}
public float branch() {
	float g =2.5f;
	float h =5.5f;
	System.out.println(g+h);
	return g;
	
}
}

