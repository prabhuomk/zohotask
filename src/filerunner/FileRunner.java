package filerunner;

import filetask.FileTask;
import myscanner.MyScanner;
import java.util.Map;
import property.Property;
import proexception.ProException;
import java.util.Properties;
import invoke.Invoker;
import firstpojo.FirstPojo;
import singleton.Advanced;
import delta.Delta;

 

class FileRunner{

public static void main(String[] args){

MyScanner inputData=new MyScanner();

FileTask task = new FileTask();

Property taskProperty = new Property();

AdAdvanced.INSTANCE;

Delta a = new Delta();

int caseNumber=inputData.getInputNumber("Enter the task number");

switch(caseNumber)
{

case 1:

          try
          {

             String fileName=inputData.getInput("Enter the file name");

             boolean resultOfCreation = task.creationOfFile(fileName);

             if(resultOfCreation)
             {
  
                System.out.println("file created successfully");
  
                int numberOfLine=inputData.getInputNumber("Enter the number of  line you want to write ");
  
                String[] inputToWrite = new String[numberOfLine];
  
                for(int i=0;i<numberOfLine;i++)
                {
                
                    inputToWrite[i]=inputData.getInput("Enter the line you want to write in the file");
  
                }
  
                task.writeToFile(fileName,inputToWrite);
                
                System.out.println("writing in the file is done");
  
             }
             else
             {

                System.out.println("file already exist");

             }


         }
         catch(ProException e)
         {

            System.out.println(e.getMessage());

         }

break;

case 2:

         try
         {

             String fileName=inputData.getInput("Enter the file name to which you want to add new lines");
   
             int numberOfLine=inputData.getInputNumber("Enter the number of  line you want to write ");
  
             String[] inputToWrite = new String[numberOfLine];
  
            for(int i=0;i<numberOfLine;i++)
            {
            
                inputToWrite[i]=inputData.getInput("Enter the line you want to write in the file");
  
            }
  
            task.writeToExistingFile(fileName,inputToWrite);

        }
        catch(ProException e)
        {

            System.out.println(e.getMessage());

        }

break;

case 3:


    try{
    
             
             Properties propertyTask=taskProperty.createProperties();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the Properties");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    String stringKey=inputData.getInput("Enter the Key of string type");
                  
                    String stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskProperty.setPropertiesForTask(propertyTask,stringKey,stringValue);
                          
             
             }
             
             String fileName=inputData.getInput("Enter the file name to store properties value");
             
             boolean resultOfCreation = task.creationOfFile(fileName);
             
             if(resultOfCreation == true)
             {
  
                   taskProperty.propertiesToFile(propertyTask,fileName);
                   
             }
             else
             {

                   System.out.println("file already exist");

             }

             
      }
      catch(ProException e)
      {
         
         System.out.println(e.getMessage());
      
      }

break;

case 4:


    try{
    
             
             Properties propertyTask=taskProperty.createProperties();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the Properties");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    String stringKey=inputData.getInput("Enter the Key of string type");
                  
                    String stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskProperty.setPropertiesForTask(propertyTask,stringKey,stringValue);
                          
             
             }
             
             String fileName=inputData.getInput("Enter the file name to store properties value");
             
             taskProperty.propertiesToOldFile(propertyTask,fileName);
             
      }
      catch(ProException e)
      {
         
         System.out.println(e.getMessage());
      
      }

break;


case 5:


    try{
    
             
             Properties propertyTask=taskProperty.createProperties();
             
             String fileName=inputData.getInput("Enter the file name to load in properties");
             
             taskProperty.oldFileToProperties(propertyTask,fileName);
             
             System.out.println(propertyTask);
             
      }
      catch(ProException e)
      {
         
         System.out.println(e.getMessage());
      
      }

break;


case 6:
         try
         {
              
              String pathName=inputData.getInput("Enter the file path");
              
              boolean resultOfPath=task.creationOfDirectory(pathName);
              
              if(resultOfPath)
              {
              System.out.println("Directory created successfully");
              }
              else
              {
              System.out.println("either Directory is already present or problem in creation");
              }
              
              String fileName=inputData.getInput("Enter the file name to store properties value");

              boolean resultOfCreation = task.creationOfFile(pathName,fileName);
             
             if(resultOfCreation)
             {
  
                   System.out.println("file created");

                   
             }
             else
             {

                   System.out.println("file already exist");

             }
         
         
         }
         catch(ProException e)
         {
         
            System.out.println(e.getMessage());
         
         }
         
break;         

case 7: try{
          
          String inputString=inputData.getInput("Enter any string");
          
          Invoker constructor = new Invoker(inputString);
          
          System.out.println(constructor);

           }
      catch(ProException e)
      {
         
         System.out.println(e.getMessage());
      
      }
    
             
             
      

break;


case 8: try{
          
          String inputName=inputData.getInput("Enter the name of the person");
          
          int inputAge=inputData.getInputNumber("Enter the age of the person");
          
          FirstPojo pojo = new FirstPojo(inputName,inputAge);
          
          System.out.println(pojo);

           }
      catch(ProException e)
      {
         
         System.out.println(e.getMessage());
      
      }
    
             
             
      

break;


case 9: try{
          
          FirstPojo pojo = new FirstPojo();
          
          String inputName=inputData.getInput("Enter the name of the person");
          
          pojo.setName(inputName);
          
          int inputAge=inputData.getInputNumber("Enter the age of the person");
          
          pojo.setAge(inputAge);
          
          String name = pojo.getName();
          
          int age = pojo.getAge();
          
          System.out.println(name);
          
          System.out.println(age);

           }
      catch(ProException e)
      {
         
         System.out.println(e.getMessage());
      
      }
    
             
             
      

break;







}



}


}
