package files;
import java.util.Formatter;

public class FileCreate {

	public static void main(String[] args) {
		final Formatter x;
		
		try{
			x = new Formatter("fred.txt");
			System.out.println("File created!");
		}
		catch(Exception e){
			System.out.println("Error!");
		}
	}

}
