package Second;
	public class Inheritence1{
		public int B() {
			int B =23;
			return B;
		}
		public float C() {
			float C =2.5F;
			return C;
		}
		public int no;
		public Float value;
		public Inheritence1(int D) {
			no =D;
		}
		public Inheritence1(float E) {
			value = E;
		}
		public int no() {
			return no;
		}
		public float E() {
			return value;
		}
		public static void main (String [] args) {
			Inheritence1 T1= new Inheritence1(2.5f);
			System.out.println(T1.E());
		}
	}

