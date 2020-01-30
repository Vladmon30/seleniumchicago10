package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

   static Properties pro;

    static {
        // this the path to the location of the file
        String path = "configurations.properties";

     try{
         // java cannot read files directly, in needs inputstream to read files
        // inputstream takes the location of the file as a contructor
        FileInputStream file = new FileInputStream(path);

         // Properties is used to read specifically properties files, files with key value pairs
        pro = new Properties();

         // file contents are load to properties from the inputstream
        pro.load(file);

         // all input streams must be closed
        file.close();


    }catch (java.io.IOException e) {
         System.out.println("Path: " + path + "-not found");

    }
  }
  public static String getProperty(String key){

        return pro.getProperty(key);
  }

    public static void main(String[] args) {
        String s = pro.getProperty("name");
        System.out.println(s);
    }
}
