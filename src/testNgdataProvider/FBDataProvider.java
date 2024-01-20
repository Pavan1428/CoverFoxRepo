package testNgdataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBDataProvider {
	
	
	//method--> data Provider
	// String firstName, String LastName, String MobNum
    @DataProvider(name="FBRegression")
    public static String[][] fbDataSet() 
    {
	  
	  String data[][]={{"Pavan","Kale","8369123996"},{"Gitika","Naik","9766482569"},{"Sakshi","Naik","9566748677"}};
	  return data;
	  
  }
    
    @DataProvider(name = "FBSanity")
    public static String[][] fbDataSet1()
    {
    String data[][]=

    {{"ABC","XYZ","9421357890"},{"PQR","LMN","999997890"},{"CBZ","WER","9488888990"}};

    return data;
    }
}
