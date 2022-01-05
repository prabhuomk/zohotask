package arraylistrunner;

import myscanner.MyScanner;
import arraylisttask.ArrayListTask;
import helper.Helper;
import proexception.ProException;
import java.util.*;



public class ArrayListRunner{


  static MyScanner scannerInput = new MyScanner();

  Helper  scannerHelper=new Helper();

  ArrayListTask task = new ArrayListTask();
  
  


private void caseOne(){


try{

               List createListForTaskOne=task.createList();
            
               int findSizeOfEmptyList = task.findSizeOfList(createListForTaskOne);
            
               System.out.println("The Size Of EmptyList ="+" "+findSizeOfEmptyList);
            
          }
          catch(ProException e)
          {
          
               System.out.println(e.getMessage());
          
          }




}

private void caseTwo()
{

try
         {
              Object[] SecondTask=scannerHelper.getStringInput();
              
              List addString=task.addObjectFromCmdLine(SecondTask);
              
              System.out.println(addString);
              
              int findSizeOfList = task.findSizeOfList(addString);
              
              System.out.println("The Size Of List ="+" "+findSizeOfList);
            
         }
         catch(ProException e)
         {
         
               System.out.println(e.getMessage());
         
         }
         
}

private void caseThree()
{

try
         {    
              Object[] thirdTask=scannerHelper.getIntegerInput();
            
              List addIntegerFromCmd=task.addObjectFromCmdLine(thirdTask);
              
              System.out.println(addIntegerFromCmd);
              
              int findSizeOfListOfIntegerObject = task.findSizeOfList(addIntegerFromCmd);
              
              System.out.println("The Size of List ="+" "+findSizeOfListOfIntegerObject);
            
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         
         }

}

private void caseFour()
{

try
         {
            
              List scannerObject=task.addCustomObject(scannerInput);
              
              System.out.println(scannerObject);
              
              int findSizeOfListOfCustomObject = task.findSizeOfList(scannerObject);
              
              System.out.println("The Size of List ="+" "+findSizeOfListOfCustomObject);
            
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }

}

private void caseFive()
{

try
         {
         
              Object[] stringInputFifthTask=scannerHelper.getStringInput();
            
              Object[] intrgerInputFifthTask=scannerHelper.getIntegerInput();
            
              List mixedObject=task.addMixedObject(stringInputFifthTask,intrgerInputFifthTask,scannerInput);
              
              System.out.println(mixedObject);
              
              int findSizeOfListOfMixedObject = task.findSizeOfList(mixedObject);
              
              System.out.println("The Size of List ="+" "+findSizeOfListOfMixedObject);
            
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         
         }



}

private void caseSix()
{

try
         {
            
              Object[] stringInputSixthTask=scannerHelper.getStringInput();
            
              List toGetIndexTask=task.addObjectFromCmdLine(stringInputSixthTask);
              
              System.out.println(toGetIndexTask);
              
              int findSizeOfListGetIndex = task.findSizeOfList(toGetIndexTask);
              
              System.out.println("The Size of List ="+" "+findSizeOfListGetIndex);
              
              Object stringToFindIndex=scannerInput.getInput("Enter the one the string which was mentioned earlier for which index need to be find");
              
              int getIndex =task.toFindIndex(toGetIndexTask,stringToFindIndex);
              
              if(getIndex == -1)
              {
                  System.out.println("The string is not present in the List");
              }
              else{
              
                    System.out.println("index is ="+getIndex);
              
                  }
              
              
              
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         
         }

}

private void caseSeven()
{

try
         {
         
               Object[] stringInputSeventhTask=scannerHelper.getStringInput();
            
               List iteratorTask=task.addObjectFromCmdLine(stringInputSeventhTask);
              
               Iterator iter = iteratorTask.iterator();
              
               while (iter.hasNext())
                {
               
                   System.out.println(iter.next());
             
                }
              
              
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         
         }

}

private void caseEight()
{

try
         {
         
              Object[] stringInputEigthTask=scannerHelper.getStringInput();
            
              List getObjectTask=task.addObjectFromCmdLine(stringInputEigthTask);
              
              System.out.println(getObjectTask);
              
              int indexValue=scannerInput.getInputNumber("Enter the index number to find the string in the list");
              
              Object toFind=task.toFindObject(getObjectTask,indexValue);
              
              System.out.println("The String at index"+" "+indexValue+" "+"is"+" "+toFind);
               
     
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }

}

private void caseNine()
{
try
         {
         
              Object[] stringInputNinthTask=scannerHelper.getStringInput();
            
              List getFirstAndLastIndexTask=task.addObjectFromCmdLine(stringInputNinthTask);
              
              System.out.println(getFirstAndLastIndexTask);
              
              Object duplicateString=scannerInput.getInput("Enter the duplicate string for which index of first occurance and last occurance will be found");
              
              int getFirstIndex =task.toFindIndex(getFirstAndLastIndexTask,duplicateString);
              
              int getLastIndex =task.toFindLastIndex(getFirstAndLastIndexTask,duplicateString);
              
              if(getFirstIndex==-1)
              {
              
                 System.out.println("The string is not present in the List");
              
              }
              else
              {
              
                  System.out.println("The first index value of the string"+" "+getFirstIndex);
              
              }
              
              if(getFirstIndex==getLastIndex)
              {
              
                 System.out.println("The string is  present only once in the List");
              }
              else
              {
              
                 System.out.println("The last index value of the string"+" "+getLastIndex );
              }
              
               
     
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }


}

private void caseTen()
{

try
         {
            
              Object[] stringInputTenthTask=scannerHelper.getStringInput();
            
              List addObjectTask=task.addObjectFromCmdLine(stringInputTenthTask);
              
              System.out.println(addObjectTask);
              
              Object inputObject =scannerInput.getInput("Enter the String needed add");
              
              int indexNum=scannerInput.getInputNumber("Enter the index number at which the above string needed to be added");
              
              task.addObjectToList(addObjectTask,inputObject,indexNum);
              
              System.out.println(addObjectTask.toString());
              
     
        }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }

}

private void caseEleven()
{

try
         {
            
              Object[] stringInputElevenTask=scannerHelper.getStringInput();
            
              List addObjectTask=task.addObjectFromCmdLine(stringInputElevenTask);
              
              System.out.println(addObjectTask);
              
              int startNum=scannerInput.getInputNumber("Enter start index number for sublist");
              
              int endNum=scannerInput.getInputNumber("Enter end index number for sublist");
              
              List subListTask=task.subListOfList(addObjectTask,startNum,endNum);
              
              System.out.println(subListTask);
              
     
        }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }

}

private void caseTwelve()
{

try
         {
            
              Object[] stringInputTweleveOneTask=scannerHelper.getStringInput();
            
              List addStringTask1=task.addObjectFromCmdLine(stringInputTweleveOneTask);
              
              System.out.println(addStringTask1);
              
              Object[] stringInputTweleveTwoTask=scannerHelper.getStringInput();
            
              List addStringTask2=task.addObjectFromCmdLine(stringInputTweleveTwoTask);
              
              System.out.println(addStringTask2);
              
              boolean resultOfJoin=task.joinTwoList(addStringTask1,addStringTask2);
              
              System.out.println(addStringTask1);
              
     
        }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }

}

private void caseThirteen()
{

try
         {
            
              Object[] stringInputTweleveOneTask=scannerHelper.getStringInput();
            
              List addStringTask1=task.addObjectFromCmdLine(stringInputTweleveOneTask);
              
              System.out.println(addStringTask1);
              
              Object[] stringInputTweleveTwoTask=scannerHelper.getStringInput();
            
              List addStringTask2=task.addObjectFromCmdLine(stringInputTweleveTwoTask);
              
              System.out.println(addStringTask2);
              
              boolean resultOfJoin=task.joinTwoList(addStringTask2,addStringTask1);
              
              System.out.println(addStringTask2);
              
     
        }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }

}

private void caseFourteen()
{

try
         {
            
              Object[] decimalInputTask=scannerHelper.getDecimalInput();
            
              List addDecimalTask=task.addObjectFromCmdLine(decimalInputTask);
              
              System.out.println(addDecimalTask);
              
              Object demialToRemove =scannerInput.getInputDecimal("Enter the decimal value that need to be removed");
              
              boolean demialToRemoveTask=task.removeObject(addDecimalTask,demialToRemove);
              
              if(demialToRemoveTask==true)
              {
              
              System.out.println(addDecimalTask);
              }
              else
              {
               System.out.println("The decimal value your entered to remove from the list is not present in the list");
              }
              
     
        }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }
         

}

private void caseFifteen()
{

try
         {
            
              Object[] decimalInputTask=scannerHelper.getDecimalInput();
            
              List addDecimalTask=task.addObjectFromCmdLine(decimalInputTask);
              
              System.out.println(addDecimalTask);
              
              int demialToRemove =scannerInput.getInputNumber("Enter the index number to remove the decimal value");
              
              Object demialToRemoveTask=task.removeObject(addDecimalTask,demialToRemove);
              
              System.out.println(addDecimalTask);
              
     
        }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }
         


}



private void caseSeventeen()
{

try
         {
              
              
              Object[] stringInputJoinTask=scannerHelper.getStringInput();
              
              List containObjectTask=task.addObjectFromCmdLine(stringInputJoinTask);
              
              System.out.println(containObjectTask);
              
              Object[] stringInputJoinTwoTask=scannerHelper.getStringInput();
              
              List containObjectTask1=task.addObjectFromCmdLine(stringInputJoinTwoTask);
              
              System.out.println(containObjectTask1);
              
              boolean callRemoveAll =task.removeObject(containObjectTask,containObjectTask1);
              
              System.out.println("The list after removing the String present in second List"+" "+containObjectTask);  
              
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }


}

private void caseEighteen()
{

try
         {
              
              
              Object[] stringInputJoinTask=scannerHelper.getStringInput();
              
              List containObjectTask=task.addObjectFromCmdLine(stringInputJoinTask);
              
              System.out.println(containObjectTask);
              
              Object[] stringInputJoinTwoTask=scannerHelper.getStringInput();
              
              List containObjectTask1=task.addObjectFromCmdLine(stringInputJoinTwoTask);
              
              System.out.println(containObjectTask1);
              
              boolean callRemoveAll =task.retainObject(containObjectTask,containObjectTask1);
              
              System.out.println("The list after removing the String which is not present in second List"+" "+containObjectTask);  
              
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }


}

private void caseNineteen()
{

try
         {
              
              
              Object[] longTask=scannerHelper.getLongInput();
              
              List longObjectTask=task.addObjectFromCmdLine(longTask);
              
              System.out.println(longObjectTask);
              
              task.clearObject(longObjectTask);
              
              System.out.println(longObjectTask);
              
              
              
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }


}

private void caseTwenty()
{

try
         {
              
              
              Object[] stringInputTwentyTask=scannerHelper.getStringInput();
              
              List containObjectTask=task.addObjectFromCmdLine(stringInputTwentyTask);
              
              System.out.println(containObjectTask);
              
              Object stringInputToCheck =scannerInput.getInput("Enter a string to check whether it is present in the list or not");
              
              boolean check= task.objectContainInList(containObjectTask,stringInputToCheck);
              
              if(check == true)
              {
                   System.out.println("Yes the given string is present");
              }
              else
              {
                   System.out.println("No the given string is not present");
              }
              
         }
         catch(ProException e)
         {
         
             System.out.println(e.getMessage());
         }

}


public static void main(String[] args){

ArrayListRunner run = new ArrayListRunner();

int caseNumber = scannerInput.getInputNumber("Enter the task number");


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

default:System.out.println("Case number is out of range");

}

}



}

