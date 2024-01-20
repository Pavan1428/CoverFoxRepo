package tesnnggProprtyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class commonlyUsedMethod {

	
	public static String readDataFromPropertyFile(String key) throws IOException {
		
		//create object of Properties
	    Properties prop= new Properties();
		
	    //Create Object of FileInputStream
		FileInputStream myFile= new FileInputStream(System.getProperty("user.dir")+"\\testNNGGProp.properties");
		//load file
		prop.load(myFile);
		//pass the Key for the data we want
		String value = prop.getProperty(key);
		return value;
		
		
	}
}
