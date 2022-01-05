package myscanner;
import java.util.Scanner;
import proexception.ProException;

public class MyScanner

{

Scanner obj = new Scanner(System.in);



// Method 1 - String Scanner

public String getInput(String caseSpecific) throws ProException
{

           System.out.println(caseSpecific);
           String stringName =obj.nextLine();
           if(stringName.isEmpty())
           {
           throw new ProException("String can't be empty");
           }
           return stringName;
           
}

// Method 2 - Char Scanner



public char getInputChar(String caseSpecificChar)
{

        System.out.println(caseSpecificChar);
        try
        {
              char letter=obj.nextLine().charAt(0);
              return letter;
        }
        catch(Exception e)
        {
           
               System.out.println("Enter a letter properly");
              
        }
         
        return getInputChar(caseSpecificChar);

}

// Method 3 - Integer Scanner

public int getInputNumber(String caseSpecificNumber)
{

         System.out.println(caseSpecificNumber);
         
         try
         {
              int numForOper =obj.nextInt();
              obj.nextLine();
              return numForOper;
         }
         catch(Exception e)
         {
              System.out.println("Enter a number ,string or char not accepted");
              obj.nextLine();
         }
         
         return getInputNumber(caseSpecificNumber);

}

// Method 4 - decimal Scanner

public double getInputDecimal(String caseSpecificNumber)
{

         System.out.println(caseSpecificNumber);
         
         try
         {
              double numForOper =obj.nextDouble();
              obj.nextLine();
              return numForOper;
         }
         catch(Exception e)
         {
              System.out.println("Enter a decimal number ,string or char not accepted");
              obj.nextLine();
         }
         
         return getInputNumber(caseSpecificNumber);

}

// Method 5 - long Scanner

public long getInputLong(String caseSpecificNumber)
{

         System.out.println(caseSpecificNumber);
         
         try
         {
              long numForOper =obj.nextLong();
              obj.nextLine();
              return numForOper;
         }
         catch(Exception e)
         {
              System.out.println("Enter a long value ,string or char not accepted");
              obj.nextLine();
         }
         
         return getInputNumber(caseSpecificNumber);

}

// Method 6 - to display all case`s details


public void caseDetails()

{

         System.out.println("case 1 find the length of a String.");
         System.out.println("case 2 convert string into character Array");
         System.out.println("case 3-find the character at the in the string by entering its index number ");
         System.out.println("case 4-find the number of occurrences of a given letter/character ");
         System.out.println("case 5- find the greatest position of the given letter/character.");
         System.out.println("case 6- print the last n characters of a given String ");
         System.out.println("case 7- print the first n characters of a given String");
         System.out.println("case 8- replace the first n characters of a String with any string");
         System.out.println("case 9- check whether a String starts with “any string”");
         System.out.println("case 10- check whether a String ends with “any string”");
         System.out.println("case 11- convert an all lowercase string to an uppercase string.");
         System.out.println("case 12- convert an all uppercase string to an lowercase string");
         System.out.println("case 13- reverse a String");
         System.out.println("case 14-  accept a line with multiple Strings");
         System.out.println("case 15- concatenate each individual Strings and output a Single String without space. ");
         System.out.println("case 16- accept a line with multiple Strings & enclose each String into a String array");
         System.out.println("case 17- accept multiple Strings & merge each String with “-” in between");
         System.out.println("case 18-check whether the two given input String are equal -case sensitive ");
         System.out.println("case 19- check whether the two given input String are equal -case in sensitive");
         System.out.println("case 20-  accept a String with a space at the end & beginning or both and output the proper String with no space either at the beginning or end.");

}

}
