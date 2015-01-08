package files;
import java.io.*;
import java.lang.*;
import java.util.*;

public class WriteToFile {
	public static void main(String[] args) {
		createfile file = new createfile();
		file.openFile();
		file.addRecords();
		file.closeFile();
	}
}

class createfile{
	private Formatter x;
	
	public void openFile() {
		try{
			x = new Formatter("chinese.txt");
		}
		catch(Exception e){
			System.out.println("Error!");
		}
	}
	
	public void addRecords(){
		x.format("%s %s %s", "20", "Sergiu", "Rosca");
	}
	
	public void closeFile(){
		x.close();
	}
}