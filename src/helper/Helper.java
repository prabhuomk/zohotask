package helper;


import myscanner.MyScanner;
import proexception.ProException;

public class Helper{

MyScanner scannerInput = new MyScanner();


public Object[] getStringInput()throws ProException{

              int numberInputForTask =scannerInput.getInputNumber("Enter the number of input string you want to add to the List ");
              
              Object[] inputStringForTask=new Object[numberInputForTask];
              
              for(int i=0;i<numberInputForTask;i++)
              {
              
              inputStringForTask[i]=scannerInput.getInput("Enter the string");
              
              
              }
              
              return inputStringForTask; 

}


public Object[] getIntegerInput()throws ProException{

              int numberInputForTask =scannerInput.getInputNumber("Enter the number of input integer you want to add to the List ");
              
              Object[] inputIntegerForTask=new Object[numberInputForTask];
              
              for(int i=0;i<numberInputForTask;i++)
              {
              
              inputIntegerForTask[i]=scannerInput.getInputNumber("Enter the integer");
              
              
              }
              
              return inputIntegerForTask; 

}


public Object[] getDecimalInput()throws ProException{

              int numberInputForTask =scannerInput.getInputNumber("Enter the number of decimal you want to add to the List ");
              
              Object[] inputDecimalForTask=new Object[numberInputForTask];
              
              for(int i=0;i<numberInputForTask;i++)
              {
              
              inputDecimalForTask[i]=scannerInput.getInputDecimal("Enter the decimal value");
              
              
              }
              
              return inputDecimalForTask; 

}

public Object[] getLongInput()throws ProException{

              int numberInputForTask =scannerInput.getInputNumber("Enter the number of long you want to add to the List ");
              
              Object[] inputLongForTask=new Object[numberInputForTask];
              
              for(int i=0;i<numberInputForTask;i++)
              {
              
              inputLongForTask[i]=scannerInput.getInputLong("Enter the long value");
              
              
              }
              
              return inputLongForTask; 

}




}

