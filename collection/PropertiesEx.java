package collection;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D:\\java\\CSR\\CORE1\\src\\collection\\db.properties");
		Properties p = new Properties();
		p.load(reader);
        System.out.println("Username "+p.getProperty("username"));
        System.out.println("Password "+p.getProperty("password"));
	}

}
