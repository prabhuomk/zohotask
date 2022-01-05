package filetask;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import utility.Utility;
import proexception.ProException;



public class FileTask{


Utility validator = new Utility();

//to create file with filename

public boolean creationOfFile(String fileName)throws ProException
{
       validator.validatorForStrings(fileName);
       
       File newFile = new File(fileName);

       try
       {
    
            return newFile.createNewFile();

       }
       catch(IOException e)
       {

            throw new ProException(e);

       }


}


// Create directory
public boolean creationOfDirectory(String pathName)throws ProException
{


       validator.validatorForStrings(pathName);
  
       File newFile = new File(pathName);

       return newFile.mkdir();



}

//to create file with pathname,filename

public boolean creationOfFile(String pathName,String fileName)throws ProException
{


       validator.validatorForStrings(fileName);

       validator.validatorForStrings(pathName);
 
       File newFile = new File(pathName,fileName);

       try
       {
    
            return newFile.createNewFile();

       }
       catch(IOException e)
       {

            throw new ProException(e);

       }


}


//Method 2-to write to a new file

public void writeToFile(String fileName,String[] inputData)throws ProException
{


     validator.validatorForStrings(fileName);
     
     BufferedWriter buffer=null;

  try
  {

      FileWriter writeData = new FileWriter(fileName);
       
      buffer = new BufferedWriter(writeData);
       
       for(int i=0;i<inputData.length;i++)
       {

          buffer.write(inputData[i]);
          
          buffer.newLine();
          
       }

       
       
  }
  catch(IOException e)
  {

       throw new ProException(e);

  }
  finally
  {
   
      try
      {
            buffer.close();
      }
      catch(IOException e)
      {   

            //throw new ProException(e);
      
      }
   
  
  }

}

//Method 3-to write to a already existing file with content

public void writeToExistingFile(String fileName,String[] inputData)throws ProException
{

  validator.validatorForStrings(fileName);

  try(FileWriter writeData = new FileWriter(fileName,true);BufferedWriter buffer = new BufferedWriter(writeData);)
  {

       
    for(int i=0;i<inputData.length;i++)
       {

         buffer.write(inputData[i]);
         
         buffer.newLine();
       }

       
       
  }
  catch(IOException e)
  {

       throw new ProException(e);

  }
  

  

}




}
