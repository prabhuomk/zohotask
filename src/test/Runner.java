package test;
import task.Task;
import myscanner.MyScanner;
import proexception.ProException;



public class Runner {


Task a = new Task();

static MyScanner data = new MyScanner();

private void caseOne(String[] args)
{


try{
       if(args.length>0){
       int resultOfCase1=a.stringLength(args[0]);
       System.out.println(resultOfCase1);
       }
       else{
       System.out.println("Argument is not passed");
       }
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
       String stringNameCase2=data.getInput("Enter the String  to convert into charArray");
       char[] resultOfCase2=a.characterArray(stringNameCase2);
       for(char charOutput:resultOfCase2)
       {
       System.out.println(charOutput);
       }
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
       String stringNameCase3=data.getInput("Enter the String ");
       int numToGetChar=data.getInputNumber("Enter the Number to get letter/char of that  string  ");
       char resultOfCase3=a.findChar(stringNameCase3,numToGetChar);
       System.out.println(resultOfCase3);
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
       String stringNameCase4=data.getInput("Enter the String ");
       char inputCharCase4=data.getInputChar("Enter letter to find the number of occurrance  of the given letter/character.");
       int resultOfCase4=a.numberOfOccurance(stringNameCase4,inputCharCase4);
       System.out.println(resultOfCase4);
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
        String stringNameCase5=data.getInput("Enter the String ");
        char inputChar=data.getInputChar("Enter to letter to find the greatest position of the given letter/character.in the string");
        int resultOfCase5=a.greatestPosition(stringNameCase5,inputChar);
        System.out.println(resultOfCase5);
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
       String stringNameCase6=data.getInput("Enter the String ");
       int numForEnd=data.getInputNumber("Enter the Number to get last n string of that number ");
       String resultOfCase6=a.lastNChar(stringNameCase6,numForEnd);
       System.out.println(resultOfCase6);
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
       String stringNameCase7=data.getInput("Enter the String ");
       int numForFirst=data.getInputNumber("Enter the Number to get first n string of that number ");
       String resultOfCase7=a.firstNChar(stringNameCase7,numForFirst);
       System.out.println(resultOfCase7);
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
       String stringNameCase8 =data.getInput("Enter the String ");
       String stringToReplace =data.getInput("Enter the string to repalce the above string");
       String resultOfCase8=a.stringReplace(stringNameCase8,stringToReplace);
       System.out.println(resultOfCase8);
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
       String stringNameCase9 =data.getInput("Enter the String to check whether it ends with certain string");
       String stringToCheckAtStart =data.getInput("enter the string to check whether it is present in start of the above entered string");
       boolean resultOfCase9=a.stringEnd(stringNameCase9,stringToCheckAtStart);
       System.out.println(resultOfCase9);
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
	String stringNameCase10 =data.getInput("Enter the String to check whether it ends with certain string");
	String stringToCheckAtEnd =data.getInput("enter the string to check whether it is present in end of the above entered string");
	boolean resultOfCase10=a.stringEnd(stringNameCase10,stringToCheckAtEnd);
        System.out.println(resultOfCase10);
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
        String stringNameCase11 =data.getInput("enter the string - it will be connverted to uppercase");
        String resultOfCase11=a.stringUpper(stringNameCase11);
        System.out.println(resultOfCase11);
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
       String stringNameCase12 =data.getInput("enter the string - it will be connverted to lowercase");
       String resultOfCase12=a.stringLower(stringNameCase12);
       System.out.println(resultOfCase12);
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
        String stringNameCase13 =data.getInput("enter the string to reverse");
        String resultOfCase13=a.stringReverse(stringNameCase13);
        System.out.println(resultOfCase13);
        }
        catch(ProException e)
       {
       System.out.println(e.getMessage());
       }

}

private void caseFourteen()
{

try{
        String stringNameCase14 =data.getInput("enter multiple string");
        System.out.println(stringNameCase14);
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
        String stringNameCase15 =data.getInput("enter multiple string it will be concate by removing space");
        String resultOfCase15=a.stringConcate(stringNameCase15);
        System.out.println(resultOfCase15);
        System.out.println("enter a proper string , null value not excepted");
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
       String stringNameCase16 =data.getInput("enter multiple string it will turned into array of string");
       String[] resultOfCase16=a.stringSplit(stringNameCase16);
       for(String w : resultOfCase16)
       System.out.println(w);
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
        String stringName1Case18 =data.getInput("Enter the a String");
        String stringName2Case18 =data.getInput("enter another string ,to compare with the above string to check whether the strings are equal or not(case sensitive)");
        boolean resultOfCase18=a.stringCaseSensitive(stringName1Case18,stringName2Case18);
        System.out.println(resultOfCase18);
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
        String stringName1Case19 =data.getInput("Enter the a String");
        String stringName2Case19 =data.getInput("enter another string ,to compare with the above string to check whether the strings are equal or not(case insensitive)");
        boolean resultOfCase19=a.stringCaseInSensitive(stringName1Case19,stringName2Case19);
        System.out.println(resultOfCase19);
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
               String stringNameCase20 =data.getInput("enter the string - it will be trim the space if present in start and end of the string");
               String resultOfCase20=a.stringTrim(stringNameCase20);
               System.out.println(resultOfCase20);
        }
        catch(ProException e)
        {
              System.out.println(e.getMessage());
        }
      


}


public static void main(String[] args){

Runner run = new Runner();

data.caseDetails();

int num=data.getInputNumber("Enter the case number");

switch(num){

case 1:run.caseOne(args);
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

default:System.out.println("you have not entered a proper cae number,see the description once and enter a valid case number");  
}
}
}
