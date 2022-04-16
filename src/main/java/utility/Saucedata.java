package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Saucedata {


public static String Getdatasauce(String key) throws IOException
{
Properties p=new Properties();
FileInputStream file=new FileInputStream("C:\\Users\\manis\\eclipse-workspace0\\saucedemo\\Myfile.properties");
p.load(file);
String value = p.getProperty(key);
return value;
}
}