package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("D:\\java\\CSR\\CORE1\\src\\filehandling\\WR File");
		 writer.write("This is String Oriented");
		 writer.close();
		 System.out.println("File is created");

	}

}
