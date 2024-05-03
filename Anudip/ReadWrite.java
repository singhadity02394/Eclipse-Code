package Anudip;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


class ReadAndWrite{
	void readFile() throws FileNotFoundException{
		FileInputStream fi = new FileInputStream("d:/abc.txt");
	}
	
	void saveFile() throws FileNotFoundException {
		String text ="this is demo";
		FileOutputStream fo = new FileOutputStream("d:/xyz.txt");
	}
}






//second class
public class ReadWrite {
	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try {
			rw.readFile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("hello");
	}

}
