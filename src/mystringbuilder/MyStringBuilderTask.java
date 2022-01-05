package mystringbuilder;


import utility.Utility;
import proexception.ProException;



public class MyStringBuilderTask{




// checker for Stringbuilder length vs Specified length mentioned


public void lengthChecker(int stringLength,int specifiedLength)throws ProException
{

      if(stringLength<specifiedLength){
      
       throw new ProException("String length should be greater or equal to the specified length mentioned");
       
       }

}








//String builder with argument



public StringBuilder myBuilder(String inputString)throws ProException
{
Utility.validatorForObject(inputString);
StringBuilder builder = new StringBuilder(inputString);
return builder;

}



//String builder without  argument

public StringBuilder myBuilder()
{

StringBuilder builder = new StringBuilder();
return builder;

}




//length method


public int stringBuilderLength(StringBuilder myBuild)throws ProException
{

    Utility.validatorForObject(myBuild);
    return myBuild.length();


}

//append method String

public StringBuilder stringBuilderAppend(StringBuilder myBuild,String inputString) throws ProException
{

    Utility.validatorForObject(myBuild);
    Utility.validatorForObject(inputString);
    return myBuild.append(inputString);


}


//append method char

public StringBuilder stringBuilderAppend(StringBuilder myBuild,char inputString) throws ProException
{

    Utility.validatorForObject(myBuild);
    return myBuild.append(inputString);


}




//insert method  Task 3

public StringBuilder myInsert(StringBuilder myBuild,String toGetIndexNo,String insertString)throws ProException{

    Utility.validatorForObject(myBuild);
    Utility.validatorForObject(toGetIndexNo);
    Utility.validatorForObject(insertString);
    int indexNumber=myIndexOf(myBuild,toGetIndexNo);
    return myBuild.insert(indexNumber,insertString);


}
// Task 4

public StringBuilder myDelete(StringBuilder myBuild,int startNumber,String toGetIndexNo)throws ProException{

        Utility.validatorForObject(myBuild);
       Utility.validatorForObject(toGetIndexNo);
       int endNumber=myIndexOf(myBuild,toGetIndexNo);
       Utility.RangeValidatorBetweenIndex(startNumber,endNumber);
       return myBuild.delete(startNumber,endNumber);


}

//Task 5

public StringBuilder myMultipleReplace(StringBuilder myBuild,int length,char input,char replaceInput)throws ProException{

           Utility.validatorForObject(myBuild);
           for(int i=0;i<length;i++)
           {
           if(myBuild.charAt(i)==input)
           myBuild.setCharAt(i,replaceInput);
           }
           return myBuild;
           

}


// reverse method Task 6

public StringBuilder reverseBuilder(StringBuilder myBuild)throws ProException{

       Utility.validatorForObject(myBuild);
       return myBuild.reverse();
}

// delete method  Task 7


public StringBuilder myDelete(StringBuilder myBuild,int startNumber,int endNumber)throws ProException{

       Utility.validatorForObject(myBuild);
       
       Utility.RangeValidatorBetweenIndex(startNumber,endNumber);
       return myBuild.delete(startNumber,endNumber);


}



//replace method Task 8

public StringBuilder myReplace(StringBuilder myBuild ,int startNumber,int endNumber,String replaceWord)throws ProException{

       Utility.validatorForObject(myBuild);
       Utility.validatorForObject(replaceWord);
      
       Utility.RangeValidatorBetweenIndex(startNumber,endNumber);
       return myBuild.replace(startNumber,endNumber,replaceWord);
}

//indexof method Task 9


public int myIndexOf(StringBuilder myBuild,String inputChar)throws ProException
{
   Utility.validatorForObject(myBuild);
   Utility.validatorForObject(inputChar);
   return myBuild.indexOf(inputChar);

}


//lastindexof method  Task 10


public int myLastIndexOf(StringBuilder myBuild,String inputString)throws ProException
{
   Utility.validatorForObject(myBuild);
   Utility.validatorForObject(inputString);
   return myBuild.lastIndexOf(inputString);

}


}
