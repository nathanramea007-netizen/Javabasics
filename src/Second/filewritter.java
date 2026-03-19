package Second;
import java.io.*;

public class filewritter {
	public static void main(String [] args) throws IOException {
		File f = new File("filewritter1.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter (fw);
		bw.write("age");
		bw.newLine();
		bw.write("number");
		bw.newLine();
		bw.write("address");
		bw.newLine();
		bw.close();
		File f1 = new File("filewritter1.txt");
		FileReader fr1 = new FileReader(f1);
		BufferedReader bw1 = new BufferedReader(fr1);
		String words;
		while((words = bw1.readLine())!= null) {
			System.out.println(words);
		}
		
		
}
}