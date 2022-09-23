package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream("D:\\java\\CSR\\CORE1\\src\\filehandling\\io file");
		
		int i=0;
		
		while((i=inputStream.read())!=-1) 
		{
			System.out.print((char)i);			
		}
			inputStream.close();
	}

}
