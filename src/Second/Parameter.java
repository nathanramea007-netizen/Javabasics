package Second;

public class Parameter {
public Parameter() {
}
public Parameter(int a) {
	System.out.println(a);
}



public static void main(String[] args) {
	int a = 45;
	int b = 55;
	System.out.println(a+b);
	Parameter p = new Parameter(24);
	p.south();
}

	
public int north() {
	int a = 23;
	int b = 33;
	System.out.println(a-b);
	return a;
}
public String south() {
	String c= "pencil";
	String d= "pen";
	System.out.println(c+d);
	return d;
	
}
}