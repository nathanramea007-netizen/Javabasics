package Second;
abstract class student{
	public int no() {
		return this.no();
	}
	
	
	abstract int a();
	abstract int address();
	
}
abstract class teacher{
	public int address() {
		return this.address();
	}
}


public  class School_abstract extends student{
	public int a() {
		return 45;
	}
	public int address() {
		return 66;
	}
	
	
	public static void main(String[] args) {
		School_abstract s1 = new School_abstract();
		System.out.print(s1.a());
	}

}
