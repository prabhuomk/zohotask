package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import myscanner.MyScanner;



public class Reflection{

public static void main(String[] args)
{

MyScanner input=new MyScanner();
try
{


         Class data = Class.forName("firstpojo.FirstPojo");

          // no args constructor

         Object obj =data.newInstance();

         System.out.println(obj);


          // parameter constructor

          Constructor call =data.getConstructor(String.class,int.class);

          String name=input.getInput("Enter the name of the person");

          int age=input.getInputNumber("Enter the age of the person");

          Object newObj =call.newInstance(name,age);

          System.out.println(newObj);

          //setter invoke

           Method setMethod=data.getMethod("setName",String.class);

           String nameSet=input.getInput("Enter the name of the person");

           setMethod.invoke(obj,nameSet);

           //getter invoke

           Method methods=data.getMethod("getName");

           Object a=methods.invoke(obj);

           System.out.println(a);



}
catch(Exception e)
{

System.out.println(e);

e.printStackTrace();

}



}





}
