package files;
import java.io.File;

public class FileExists {

	public static void main(String[] args) {
		File x = new File("test.txt");
		File y = new File("test1.txt");
		
		if (x.exists()) {
			System.out.println(x.getName() + " exists!");
		} else {
			System.out.println("File not found");
		}
		if (y.exists()) {
			System.out.println(y.getName() + " exists!");
		} else {
			System.out.println(y.getName() + " File not found");
		}
	}

}
