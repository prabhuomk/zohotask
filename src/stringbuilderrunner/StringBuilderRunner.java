package stringbuilderrunner;

import mystringbuilder.MyStringBuilderTask;
import myscanner.MyScanner;
import proexception.ProException;




public class StringBuilderRunner {


MyStringBuilderTask task = new MyStringBuilderTask();

static MyScanner data = new MyScanner();

private void caseOne()
{

try{
            
            StringBuilder task1 =task.myBuilder();
       
            int StringBuilderlengthBeforeAppend1 =task.stringBuilderLength(task1);
       
            System.out.println("Length="+ StringBuilderlengthBeforeAppend1);
       
            String stringName1=data.getInput("Enter the String to append");
       
            task1= task.stringBuilderAppend(task1,stringName1);
       
            int StringBuilderlengthAfterAppend1 =task.stringBuilderLength(task1);
       
            System.out.println("Length of Stringbuilder after append ="+StringBuilderlengthAfterAppend1+" "+task1);
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }
       

}

private void caseTwo()
{

try{
            
            String stringName2=data.getInput("Enter the String");
            
            StringBuilder task2 = task.myBuilder(stringName2);
       
            int StringBuilderlengthBeforeAppend2 =task.stringBuilderLength(task2);
       
            System.out.println("Length="+ StringBuilderlengthBeforeAppend2+""+task2);
            
            int stringNumber=data.getInputNumber("Enter the number of String you want to append");
            
            for(int i=0;i<stringNumber;i++)
            {
            String stringName21=data.getInput("Enter the String the string to append");
            
            task2= task.stringBuilderAppend(task2,"#"+stringName21);
            }
       
            int StringBuilderlengthAfterAppend2 =task.stringBuilderLength(task2);
       
            System.out.println("Length of Stringbuilder after append ="+StringBuilderlengthAfterAppend2+" "+task2);
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }
       


}

private void caseThree()
{

try{ 
            
            
            
              String stringName31=data.getInput("Enter the first String");
              
              String stringName32=data.getInput("Enter the second String");
              
              String stringToAdd3=data.getInput("Enter the char to separate the above two string");
            
              StringBuilder task3 =task.myBuilder(stringName31);
       
              task3=task.stringBuilderAppend(task3,stringToAdd3);
              
              task3=task.stringBuilderAppend(task3,stringName32);
              
              int StringBuilderlengthBeforeAppend3 =task.stringBuilderLength(task3);
       
              System.out.println("Length="+ StringBuilderlengthBeforeAppend3+" "+task3);
              
              
              
              String stringName33=data.getInput("Enter the String");
              
              task3=task.myInsert(task3,stringToAdd3,stringToAdd3+stringName33);
              
              int StringBuilderlengthAfterAppend3 =task.stringBuilderLength(task3);
       
             System.out.println("Length of Stringbuilder after insert ="+StringBuilderlengthAfterAppend3+" "+task3);
              
              
             
            
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }

}

private void caseFour()
{

try{ 
            
            
            
              String stringName41=data.getInput("Enter the first String");
              
              String stringName42=data.getInput("Enter the second String");
              
              String stringToAdd4=data.getInput("Enter the char to separate the above two string");
              
              StringBuilder task4 =task.myBuilder(stringName41);
              
              task4=task.stringBuilderAppend(task4,stringToAdd4);
              
              task4=task.stringBuilderAppend(task4,stringName42);
       
              int StringBuilderlengthBeforeDelete1 =task.stringBuilderLength(task4);
       
              System.out.println("Length="+ StringBuilderlengthBeforeDelete1+" "+task4);
              
              task4=task.myDelete(task4,0,stringToAdd4);
              
              int StringBuilderlengthAfterDelete1 =task.stringBuilderLength(task4);
       
             System.out.println("Length of Stringbuilder after delete ="+StringBuilderlengthAfterDelete1+" "+task4);
              
              
             
            
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }
       

}

private void caseFive()
{

try{ 
            
            
            
              String stringName51=data.getInput("Enter the String");
              
              String stringName52=data.getInput("Enter the String");
              
              String stringName53=data.getInput("Enter the String");
            
              char charToAdd5=data.getInputChar("Enter the char that needed to be present in between the above string");
              
              StringBuilder task5 =task.myBuilder(stringName51);
              
              task5=task.stringBuilderAppend(task5,charToAdd5);
              
              task5=task.stringBuilderAppend(task5,stringName52);
              
              task5=task.stringBuilderAppend(task5,charToAdd5);
              
              task5=task.stringBuilderAppend(task5,stringName53);
       
       
              int StringBuilderlengthBeforeMultipleReplace =task.stringBuilderLength(task5);
       
              System.out.println("Length="+ StringBuilderlengthBeforeMultipleReplace+" "+task5);
              
              char charToReplace5=data.getInputChar("Enter the char that needed to replace the in between  string");
              
              //main
              
              task5=task.myMultipleReplace(task5,StringBuilderlengthBeforeMultipleReplace,charToAdd5,charToReplace5);
              
              int StringBuilderlengthAfterReplaceTask =task.stringBuilderLength(task5);
       
             System.out.println("Length of Stringbuilder after replace ="+StringBuilderlengthAfterReplaceTask+" "+task5);
              
              
             
            
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }

}

private void caseSix()
{

try{ 
            
            
            
              String stringName61=data.getInput("Enter the String");
              
              String stringName62=data.getInput("Enter the String");
              
              String stringName63=data.getInput("Enter the String");
            
              String stringToAdd6=data.getInput("Enter the String that needed to be present in between the above string");
              
              StringBuilder task6 =task.myBuilder(stringName61);
              
              task6=task.stringBuilderAppend(task6,stringToAdd6);
              
              task6=task.stringBuilderAppend(task6,stringName62);
              
              task6=task.stringBuilderAppend(task6,stringToAdd6);
              
              task6=task.stringBuilderAppend(task6,stringName63);
       
       
              int StringBuilderlengthBeforeReverse =task.stringBuilderLength(task6);
       
              System.out.println("Length="+ StringBuilderlengthBeforeReverse+" "+task6);
              
              //main
              
              task6=task.reverseBuilder(task6);
              
              int StringBuilderlengthAfterReverse =task.stringBuilderLength(task6);
       
             System.out.println("Length of Stringbuilder after delete ="+StringBuilderlengthAfterReverse+" "+task6);
              
              
             
            
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }

}

private void caseSeven()
{

try{ 
            
            
              int specifyLengthOfInput=data.getInputNumber("Enter the minimum range for the string");
              
              String stringName7=data.getInput("Enter the String");
              
              StringBuilder task7 =task.myBuilder(stringName7);
       
              int StringBuilderlengthBeforeDelete =task.stringBuilderLength(task7);
              
              task.lengthChecker(StringBuilderlengthBeforeDelete,specifyLengthOfInput);
       
              System.out.println("Length="+ StringBuilderlengthBeforeDelete+" "+task7);
              
              int startIndexForDelete=data.getInputNumber("Enter the startIndex number");
              
              int endIndexForDelete=data.getInputNumber("Enter the endIndex number");
              
              //main method
              task7=task.myDelete(task7,startIndexForDelete,endIndexForDelete);
              
              int StringBuilderlengthAfterDelete =task.stringBuilderLength(task7);
       
             System.out.println("Length of Stringbuilder after delete ="+StringBuilderlengthAfterDelete+" "+task7);
              
              
             
            
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }
       

}

private void caseEight()
{

try{ 
            
            
              int specifyLength=data.getInputNumber("Enter the minimum range for the string");
              
              String stringName8=data.getInput("Enter the String");
              
              StringBuilder task8 =task.myBuilder(stringName8);
       
              int StringBuilderlengthBefore8 =task.stringBuilderLength(task8);
              
              task.lengthChecker(StringBuilderlengthBefore8,specifyLength);
              
              
              System.out.println("Length="+ StringBuilderlengthBefore8+" "+task8);
              
              String replaceString=data.getInput("Enter the replace String");
              
              int startIndex=data.getInputNumber("Enter the startIndex number");
              
              int endIndex=data.getInputNumber("Enter the endIndex number");
              
              //main method
              task8=task.myReplace(task8,startIndex,endIndex,replaceString);
              
              int StringBuilderlengthAfterAppend8 =task.stringBuilderLength(task8);
       
              System.out.println("Length of Stringbuilder after delete ="+StringBuilderlengthAfterAppend8+" "+task8);
             
              
              
             
            
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }
       

}

private void caseNine()
{

try{ 
            
            
            
              String stringName91=data.getInput("Enter the first String");
              
              String stringName92=data.getInput("Enter the second String");
              
              String stringName93=data.getInput("Enter the third String");
              
              String stringToAdd9=data.getInput("Enter the char that needed to be present in between the above string");
              
              StringBuilder task9 =task.myBuilder(stringName91);
              
              task9=task.stringBuilderAppend(task9,stringToAdd9);
              
              task9=task.stringBuilderAppend(task9,stringName92);
              
              task9=task.stringBuilderAppend(task9,stringToAdd9);
              
              task9=task.stringBuilderAppend(task9,stringName93);
       
              int StringBuilderlengthBefore9 =task.stringBuilderLength(task9);
       
              System.out.println("Length="+ StringBuilderlengthBefore9+" "+task9);
              
              //main method
              
              int myIndex1=task.myIndexOf(task9,stringToAdd9);
              
              System.out.println("index of first occurance of"+" "+stringToAdd9+"="+myIndex1);
              
              
             
            
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }

}

private void caseTen()
{

try{ 
            
            
            
              String stringName101=data.getInput("Enter the first String");
              
              String stringName102=data.getInput("Enter the second String");
              
              String stringName103=data.getInput("Enter the third String");
              
              String charToAdd10=data.getInput("Enter the Char that needed to be present in between the above string");
              
              StringBuilder task10 =task.myBuilder(stringName101);
              
              task10=task.stringBuilderAppend(task10,charToAdd10);
              
              task10=task.stringBuilderAppend(task10,stringName102);
              
              task10=task.stringBuilderAppend(task10,charToAdd10);
              
              task10=task.stringBuilderAppend(task10,stringName103);
              
       
              int StringBuilderlengthBefore10 =task.stringBuilderLength(task10);
       
              System.out.println("Length="+ StringBuilderlengthBefore10+" "+task10);
              
              //main method
              int myIndex2=task.myLastIndexOf(task10,charToAdd10);
              
              System.out.println("index of last occurance of"+" "+charToAdd10+"="+myIndex2);
              
              
             
            
         }
       
       catch(ProException e)
       
       {
            System.out.println(e.getMessage());
       }
       

}





public static void main(String[] args){

StringBuilderRunner run = new StringBuilderRunner();

int num=data.getInputNumber("Enter the case number");

switch(num){

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

default:System.out.println("You have not entered a proper cae number,see the description once and enter a valid case number");  
}
}
}
