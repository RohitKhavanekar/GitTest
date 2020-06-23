package GlobalValuesDeclar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {

	public static void main(String[] args) throws IOException 
	{
		//CREATE A FILE NAMED AS "DATA.PROPERTIES" WITH ".PROPERTIES" EXTENSION
		Properties prop = new Properties();//Create properties Object
		FileInputStream fis =new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\UdemyPractice\\src\\GlobalValuesDeclar\\data.properties");//Create File Input Stream object and give the location of the data.properties file
		prop.load(fis);//load the fis object file in the compiler 
		System.out.println(prop.getProperty("browser"));//print 
		System.out.println(prop.getProperty("url"));//print
		prop.setProperty("browser", "firefox");//modifi data the ongoing data
		System.out.println(prop.getProperty("browser"));//print
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\UdemyPractice\\src\\GlobalValuesDeclar\\data.properties");//modify the data and also reflace the changes in the stored file
		prop.store(fos, null);//fos object to store it in the file
		System.out.println("Git Test Checking");
		System.out.println("Git Test Checking");
		System.out.println("Git Test Checking");
		System.out.println("Git Test Checking");
		System.out.println("Git Test Checking");
		System.out.println("Changed for checking");
		
		

	}

}
