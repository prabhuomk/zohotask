package property;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Properties;
import utility.Utility;
import proexception.ProException;

public class Property{


Utility validator = new Utility();


public Properties createProperties(){


     Properties task= new Properties();

     return task;

}


public Object setPropertiesForTask(Properties inputProperties,String key,String value)throws ProException{


      validator.validatorForProperties(inputProperties);
      
      validator.validatorForStrings(key);
      
      validator.validatorForStrings(value);

      return inputProperties.setProperty(key,value);

}



public void propertiesToFile(Properties inputProperties,String fileName)throws ProException{

       
       
       validator.validatorForProperties(inputProperties);
      
       validator.validatorForStrings(fileName);
       
       
       try
       {
       
       
       FileWriter writeData = new FileWriter(fileName);

       inputProperties.store(writeData,"myfirstPropertiestask");
        
       }
       catch(IOException e)
       {
         
         throw new ProException(e);
       
       }



}

public void propertiesToOldFile(Properties inputProperties,String fileName)throws ProException{

       
       
       
       validator.validatorForProperties(inputProperties);
      
       validator.validatorForStrings(fileName);
       try
       {
       
       
       FileWriter writeData = new FileWriter(fileName,true);

       inputProperties.store(writeData,"myfirstPropertiestask");
        
       }
       catch(IOException e)
       {
         
         throw new ProException(e);
       
       }



}


public void oldFileToProperties(Properties inputProperties,String fileName)throws ProException{

       
       
       validator.validatorForProperties(inputProperties);
      
       validator.validatorForStrings(fileName);
       
       try
       {
       
       
       FileReader readData = new FileReader(fileName);
       
       BufferedReader buffer = new BufferedReader(readData);

       inputProperties.load(buffer);
       
       
        
       }
       catch(IOException io)
       {
         
         throw new ProException(io);
       
       }
       



}







}
