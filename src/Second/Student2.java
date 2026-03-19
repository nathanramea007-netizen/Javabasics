package Second;


class School{
	 String schoolName;
	int year;
	String place;
	
	School(int year){
		this.year = year;
	}
	
	public String schoolName() {
		return this.schoolName;
	}
}
 
class Teacher extends School{
	Teacher(int year){
		super(year);
	}
}


public class Student2 extends School {
	
	int age;
	String name;
	int classes;
	
	Student2(int age,int classes,String name,int year){
		super(year);
		this.age = age;
		this.classes = classes;
		this.name = name;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Student2 s = new Student2(18,8,"S",2003);
		
//		Shape sh = new Shape();
//		sh.getWidth();		
//		s.getName();
//		s.year();
		Shape s1 = new Shape();
		s1.setWidth(24);
		System.out.println(s1.getWidth());
		s1.setcolor("blue");
		System.out.println(s1.getcolor());
		s1.setheight(28);
		System.out.println(s1.getheight());
	}
	
	

}




class Shape{
	private int width;
	protected int height;
	private String color;
	
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int w) {
		this.width = w;
	}
	public int getheight() {
		return this.height;
	}
	public void setheight(int v) {
		this.height =v;
	}
	public String getcolor() {
		return this.color;
	}
	public void setcolor(String j) {
		 this.color =j;
	}

	
}




