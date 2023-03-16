package cydeo.com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
in this class, we will be creating the re-usable logic to read from the configuation
.properties file
 */
public class ConfigurationReader {

    // Step 1
//making it private so that it isn't visible outside the class
//    making it "static" is to make sure that it gets created and loaded before everything else.
    private static Properties properties = new Properties();

    static {

        try{

            //    step 2
            FileInputStream file = new FileInputStream("configuration.properties");
//    step 3
            properties.load(file);

            // close the file after it has been loaded into memeory

            file.close();

        }catch (IOException e){
            System.out.println("\"FILE NOT FOUND WITH GIVEN PATH!\" = " + "FILE NOT FOUND WITH GIVEN PATH!");
            e.printStackTrace();
        }


    }

    //create a utility method to use the object to read
//    step 4 - Use "properties" object to read from the file (read properties)

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }




}
