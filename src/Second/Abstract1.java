package Second;
abstract class Abstract1{
	int pen = 30;
	int pencil =20;
	int penpencil =45;
	
}









public class Abstract1 {
	int pen = 30;
	int pencil =20;
	int penpencil =45;
	public Abstract1 (int a, int b, int c) {
		this.pen=a;
		this.pencil=b;
		this.penpencil=c;
	}
	public static void main(String [] args){
		Abstract1 A1 = new Abstract1(30,20,45);
		System.out.print(A1.pen());
		
		
	}
	

}
