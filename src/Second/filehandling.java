package Second;
import java.io.*;

public class filehandling {
	public static void main(String [] args) throws IOException{
		File f = new File("filehandling.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String text;
		while((text=br.readLine())!=null) {
			System.out.println(text);
		}
	}

}