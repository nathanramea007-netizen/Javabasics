package Second;


public class Inheri4 {
	private int password;
	public  String name;
	public String email;
	
	public Inheri4 (int a,String b,String c) {
		this.password=a;
		this.name=b;
		this.email=c;
	}
	public int getpassword() {
		return password;
	}
	public String getname() {
		return name;
	}
	
	public static void main(String[] args) {
		Inheri4 I4 = new Inheri4(23,"agr","email.com");
		System.out.println(I4.getpassword());
		System.out.println(I4.getname());
	}
	

}
