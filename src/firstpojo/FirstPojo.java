package firstpojo;

public class FirstPojo{

private String name;

private int age;


public FirstPojo(String inputName,int inputAge)
{

   name=inputName;
   age=inputAge;

}

public FirstPojo()
{

name="no name";
age=0;

}


public String toString()
{

     return name+" "+age;

}


public void setName(String inputName)
{

      name=inputName;

}

public String getName()
{

       return name;

}

public void setAge(int inputAge)
{

       age=inputAge;

}

public int getAge()
{

       return age;

}





}
