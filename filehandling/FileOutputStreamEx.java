package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args)throws IOException {
		
		FileOutputStream outputStream = new FileOutputStream("D:\\java\\CSR\\CORE1\\src\\filehandling\\io file",true); // aahe to content overwrite hou nye mhnun true
		String str= "Welcome to Edubridge";
		byte bArr[]=str.getBytes(); //converting string into byte
		
		outputStream.write(bArr);
		outputStream.close();
		
		System.out.println("File is created");

	}

}