package hashmaprunner;

import proexception.ProException;
import hashmapmethod.HashMapMethod;
import myscanner.MyScanner;
import java.util.*;

public class HashMapRunner{

static MyScanner inputData = new MyScanner();

HashMapMethod taskMethod= new HashMapMethod();

private void caseOne()
{

try{
              
              Map<Object,Object> newMap=taskMethod.createMap();
              
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);

           }
         catch(ProException e)
           {
          
              System.out.println(e.getMessage());
          
           }

}

private void caseTwo()
{

try{
             
             System.out.println("Task- To add key and value of String type");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
               for(int i=0;i<numberOfPair;i++)
             
               {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
               }
             
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
          

}

private void caseThree()
{

try{
             
             System.out.println("Task- To add key and value of Integer type");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
               for(int i=0;i<numberOfPair;i++)
               {
             
                    Object integerKey=inputData.getInputNumber("Enter the Key of integer type");
                  
                    Object integerValue=inputData.getInputNumber("Enter the Value of integer type");
                  
                    taskMethod.putKeyValue(newMap,integerKey,integerValue);
                          
             
               }
             
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
             
             }
             
               catch(ProException e)
               {
          
                System.out.println(e.getMessage());
          
               }

}

private void caseFour()
{

try{
             
                  System.out.println("Task- To add key of String type and value of Integer type");
             
                  Map<Object,Object> newMap=taskMethod.createMap();
             
                  int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
                    for(int i=0;i<numberOfPair;i++)
                    {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object integerValue=inputData.getInputNumber("Enter the Value of integer type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,integerValue);
                          
                    }
             
                 int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
                 System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
                 System.out.println("The HashMap "+" "+newMap);
             
               }
               
               catch(ProException e)
               {
          
                System.out.println(e.getMessage());
          
               }
               

}

private void caseFive()
{

 try{
             
             System.out.println("Task- To add key of String type and value of Object type");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             Object objectValue[]=new Object[]{inputData,taskMethod};
             
             for(int i=0;i<2;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                    
                    System.out.println("the value of Object is added");
                  
                    taskMethod.putKeyValue(newMap,stringKey,objectValue[i]);
                          
             
             }
             
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
          


}

private void caseSix()
{

try{
             
             System.out.println("Task- To add key of String type and value of String type");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             for(int i=0;i<numberOfPair;i++)
             {
                     
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                    
                    if(i==(numberOfPair-1))
                    {
                         Object stringValue=null;
                         
                         taskMethod.putKeyValue(newMap,stringKey,stringValue);
                    
                    }
                    else
                    {
                         Object stringValue=inputData.getInput("Enter the Value of String type");
                         
                         taskMethod.putKeyValue(newMap,stringKey,stringValue);
                     
                    }
              
              }
             
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
             
             
             
              }
              catch(ProException e)
              {
          
                 System.out.println(e.getMessage());
          
              }

}

private void caseSeven()
{

try{
             
              System.out.println("Task- To add null key  and non null value");
             
              Map<Object,Object> newMap=taskMethod.createMap();
              
              Object stringValue=inputData.getInput("Enter the Value of String type");
             
              taskMethod.putKeyValue(newMap,null,stringValue);
                     
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
             
             
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }

}

private void caseEight()
{

try{
             
             System.out.println("Task- To check the given key is present or not");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             
             Object keyToCheck=inputData.getInput("Enter the key to check whether it is present in the map or not");
                  
             
             boolean checkKeyMethod=taskMethod.checkKey(newMap,keyToCheck);
             
             if(checkKeyMethod==true)
             {
             
                   System.out.println("The key is present in the map ");
             
             }
             else
             {
             
                   System.out.println("The key is not present in the map ");
             
             }
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
          

}

private void caseNine()
{

try{
             
             System.out.println("Task- To check the give value is present or not");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             
             Object valueToCheck=inputData.getInput("Enter the value to check whether it is present in the map or not");
                  
             
             boolean checkValueMethod=taskMethod.checkValue(newMap,valueToCheck);
             
             if(checkValueMethod==true)
             {
             
                   System.out.println("The value is present in the map ");
             
             }
             else
             {
             
                   System.out.println("The value is not present in the map ");
             
             }
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
          

}

private void caseTen()
{

try{
             
             System.out.println("Task- To change the all the values");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
              
              
              System.out.println("The HashMap "+" "+newMap);
             
             
             Map<Object,Object> newMap1=taskMethod.createMap();
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey1=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue1=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap1,stringKey1,stringValue1);
                          
             
             }
             
              
              System.out.println("The HashMap "+" "+newMap1);
             
             
             taskMethod.transfer(newMap1,newMap);
             
             System.out.println("The HashMap "+" "+newMap);
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
          

}

private void caseEleven()
{

try{
             
             System.out.println("Task- To get the value using key");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             
             Object keyForGetMethod =inputData.getInput("Enter the Key of string type to get its value");
             
             Object resultOfGetMethod=taskMethod.getValue(newMap,keyForGetMethod);
             
             System.out.println(resultOfGetMethod);
             
             
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }

}

private void caseTwelve()
{

try{
             
             System.out.println("Task- To get the value of a non exsiting  key");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             
             Object keyForGetMethod =inputData.getInput("Enter the Key of string type to get its value");
             
             Object resultOfGetMethod=taskMethod.getValue(newMap,keyForGetMethod);
             
             System.out.println(resultOfGetMethod);
             
             
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
         


}

private void caseThirteen()
{

try{
             
             System.out.println("Task- To return default value for non existing key");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             
             Object keyForGetMethod =inputData.getInput("Enter the Key of string type to get its value");
             
             Object defaultValue =inputData.getInput("Enter the default value so that in case of non existing key, the default value be returned");
             
             Object resultOfGetMethod=taskMethod.getDefaultValue(newMap,keyForGetMethod,defaultValue);
             
             System.out.println(resultOfGetMethod);
             
             
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
          

}

private void caseFourteen()
{

try{
             
             System.out.println("Task- To remove a key");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              Object keyToRemove =inputData.getInput("Enter the Key of string type to get its value");
              
              taskMethod.removeKey(newMap,keyToRemove);
              
              int sizeOfMap1 = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              
             
             
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }

}

private void caseFifteen()
{

try{
             
             System.out.println("Task- To remove a key based on value");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              Object keyToRemove =inputData.getInput("Enter the Key of string type to get its value");
              
              Object valueOfAboveKey =inputData.getInput("Enter the value of the above key");
              
              taskMethod.removeKey(newMap,keyToRemove,valueOfAboveKey);
              
              int sizeOfMap1 = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              
             
             
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }


}

private void caseSixteen()
{

try{
             
             System.out.println("Task- To replace value of a key");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              Object keyForReplace =inputData.getInput("Enter the Key of string type to replace its value");
              
              Object valueToReplace =inputData.getInput("Enter the value to replace");
              
              taskMethod.replaceValue(newMap,keyForReplace,valueToReplace);
              
              int sizeOfMap1 = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              
             
             
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }

}

private void caseSeventeen()
{

try{
             
             System.out.println("Task- To replace value of a key based on value");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             
              int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              Object keyForReplace =inputData.getInput("Enter the Key of string type to replace its value");
              
              Object oldValue =inputData.getInput("Enter the old value");
              
              Object valueToReplace =inputData.getInput("Enter the value to replace");
              
              taskMethod.replaceValue(newMap,keyForReplace,oldValue,valueToReplace);
              
              int sizeOfMap1 = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              
             
             
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
          

}

private void caseEighteen()
{

try{
             
             System.out.println("Task- To change  all the values");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
              
              
              System.out.println("The HashMap "+" "+newMap);
             
             
             Map<Object,Object> newMap1=taskMethod.createMap();
             
             int numberOfPair1=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             for(int i=0;i<numberOfPair1;i++)
             {
             
                    Object stringKey1=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue1=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap1,stringKey1,stringValue1);
                          
             
             }
             
              
              System.out.println("The HashMap "+" "+newMap1);
             
             
             taskMethod.transfer(newMap1,newMap);
             
             System.out.println("The HashMap "+" "+newMap);
             
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
         

}

private void caseNineteen()
{

try{
             
             System.out.println("Task- To iterate key and values");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              for (Map.Entry<Object,Object> entry : newMap.entrySet())
              
              {
                    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
              
              }
              
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
          


}

private void caseTwenty()
{

try{
             
             System.out.println("Task- To remove all key and values");
             
             Map<Object,Object> newMap=taskMethod.createMap();
             
             int numberOfPair=inputData.getInputNumber("Enter the number of Key:Value pair you want to put in the HashMap");
             
             
             
             for(int i=0;i<numberOfPair;i++)
             {
             
                    Object stringKey=inputData.getInput("Enter the Key of string type");
                  
                    Object stringValue=inputData.getInput("Enter the Value of string type");
                  
                    taskMethod.putKeyValue(newMap,stringKey,stringValue);
                          
             
             }
             int sizeOfMap = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap);
              
              System.out.println("The HashMap "+" "+newMap);
              
              taskMethod.removeAll(newMap);
              
              int sizeOfMap1 = taskMethod.sizeOfMap(newMap);
              
              System.out.println("The Size of the HashMap"+" "+sizeOfMap1);
              
              System.out.println("The HashMap "+" "+newMap);
              
              
              
          }
          catch(ProException e)
          {
          
             System.out.println(e.getMessage());
          
          }
          

}



public static void main(String[] args){

HashMapRunner run = new HashMapRunner();

int caseNumber=inputData.getInputNumber("Enter the task number you want to execute");

switch(caseNumber)
{

case 1:run.caseOne();
break;

case 2:run.caseTwo();
break;
         
case 3:run.caseThree();
break;

case 4:run.caseFour();
break;

case 5:run.caseFive();
break;

case 6:run.caseSix();
break;

case 7:run.caseSeven();
break;

case 8:run.caseEight();
break;

case 9:run.caseNine();
break;

case 10:run.caseTen();
break;

case 11:run.caseEleven();        
break;

case 12:run.caseTwelve();         
break;

case 13:run.caseThirteen();         
break;

case 14:run.caseFourteen();
break;

case 15:run.caseFifteen();
break;

case 17:run.caseSeventeen();
break;

case 18:run.caseEighteen();
break;

case 19:run.caseNineteen();
break;

case 20:run.caseTwenty();
break;

                
default:System.out.println("Try to select between 1 to 20 (inclusive1,20)");          


}

}
}
