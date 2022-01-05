package task;

import proexception.ProException;
import utility.Utility;

public class Task {


//program 1


public int stringLength(String args) throws ProException
{

    Utility.validatorForObject(args);
    return args.length();

}


//program 2

public char[] characterArray(String inputString)throws ProException
{


      Utility.validatorForObject(inputString);
      char[] myChar = inputString.toCharArray();
      return myChar;
}

//program 3

public char findChar(String inputString , int num)throws ProException
{


     int length =stringLength(inputString);
     Utility.indexRangeValidator(length,num);
     return inputString.charAt(num);


}

//program 4

public int numberOfOccurance(String inputString,char inputChar)throws ProException
{


    Utility.validatorForObject(inputString);
    int processedInputLength=stringLength(inputString);
    int num = 0;
    for(int i=0;i<processedInputLength;i++)
    {
        if(inputString.charAt(i)==inputChar)
        {
           num++;
        }
    }
    return num;

}



//program 5

public int greatestPosition(String inputString,char inputChar)throws ProException
{


    Utility.validatorForObject(inputString);
    return inputString.lastIndexOf(inputChar);

}



//program 6

public String lastNChar(String inputString , int lastnNum)throws ProException
{  

    int length =stringLength(inputString);
    Utility.indexRangeValidator(length,lastnNum);
    return inputString.substring(length-lastnNum);
    
}

//program 7


public String firstNChar(String inputString , int firstnNum)throws ProException
{


     int length =stringLength(inputString);
     Utility.indexRangeValidator(length,firstnNum);
     return inputString.substring(0,firstnNum);


}



//program 8


public String stringReplace(String inputString,String replaceString)throws ProException
{


      Utility.validatorForObject(inputString);
      Utility.validatorForObject(replaceString);
      int processedInputLength2=stringLength(replaceString);
      return replaceString+inputString.substring(processedInputLength2);

}

//program 9


public boolean stringStart(String inputString,String startStringToCheck)throws ProException
{

     Utility.validatorForObject(inputString);
     Utility.validatorForObject(startStringToCheck);
     return inputString.startsWith(startStringToCheck);

}

//program 10


public boolean stringEnd(String inputString,String endStringToCheck)throws ProException
{

     Utility.validatorForObject(inputString);
     Utility.validatorForObject(endStringToCheck);
     return inputString.endsWith(endStringToCheck);

}

//program 11


public String stringUpper(String inputString)throws ProException
{
      Utility.validatorForObject(inputString);
      return inputString.toUpperCase();

}

//program 12


public String stringLower(String inputString)throws ProException
{

     Utility.validatorForObject(inputString);
     return inputString.toLowerCase();

}

//program 13


public String stringReverse(String inputString)throws ProException
{


    Utility.validatorForObject(inputString);
    String reverse="";
    char stringChar;
    int processedStringLength=stringLength(inputString);
    for (int i=0; i<processedStringLength; i++)
      {
        stringChar=inputString.charAt(i); 
        reverse= stringChar+reverse; 
      }
    return reverse;

}

//program 15


public String stringConcate(String inputString)throws ProException
{

   Utility.validatorForObject(inputString);
   return inputString.replaceAll("\\s","");

}

//program 16


public String[]  stringSplit(String inputString)throws ProException
{
     Utility.validatorForObject(inputString);
     String[] words=inputString.split("\\s");
     return words;
}



//program 18

public boolean stringCaseSensitive(String inputString1,String inputString2)throws ProException
{

     Utility.validatorForObject(inputString1);
     Utility.validatorForObject(inputString2);
     return inputString1.equals(inputString2);

}

//program 19

public boolean stringCaseInSensitive(String inputString1,String inputString2)throws ProException
{

     Utility.validatorForObject(inputString1);
     Utility.validatorForObject(inputString2);
     return inputString1.equalsIgnoreCase(inputString2);

}

//program 20

public String stringTrim(String inputString) throws ProException
{
      Utility.validatorForObject(inputString);
      return inputString.trim();

}



}

