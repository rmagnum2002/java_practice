package files;
import java.io.*;
import java.util.*;

public class ReadFile {

	public static void main(String[] args) {
		readfile file = new readfile();
		file.openFile();
		file.readFile();
		file.closeFile();
	}

}

class readfile{
	private Scanner x;
	
	public void openFile() {
		try {
			x =new Scanner(new File("chinese.txt"));
		} catch (Exception e) {
			System.out.println("file nout found!");
		}
	}
	
	public void readFile() {
		while (x.hasNext()) {
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n", a, b, c);
		}
	}
	
	public void closeFile(){
		x.close();
	}
	
}

// 2:50