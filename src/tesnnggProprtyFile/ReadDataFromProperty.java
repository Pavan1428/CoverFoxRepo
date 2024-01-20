package tesnnggProprtyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		//create object of Properties
	    Properties prop= new Properties();
	    //Create Object of FileInputStream
		//FileInputStream myFile= new FileInputStream("C:\\Users\\naikg\\eclipse-workspace\\Teju_Selenium\\testNNGGProp.properties");

	    FileInputStream myFile = new FileInputStream(System.getProperty("user.dir")+"\\\\testNNGGProp.properties");
		prop.load(myFile);
		String value = prop.getProperty("age");

		System.out.println(value);

	}

}
