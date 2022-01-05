package arraylisttask;

import java.util.List;
import utility.Utility;
import proexception.ProException;

public class ArrayListTask{





//Creation of List


public List createList()throws ProException
{
           
                        
          List createList= null;
                     
                         try
                            {
                    
                             Class className=Class.forName("java.util.ArrayList");
                             
                             Object object=className.newInstance();
                             
                             createList = (List)object;
                             
                             
                            }
                          catch(InstantiationException i)
                            {
                              i.printStackTrace();
                              
                              
                            }
                          catch(IllegalAccessException a)
                            {
                               a.printStackTrace();
                               
                               
                            }
                          catch(ClassNotFoundException x)
                           {
          
                                   try
                                   {
                                      Class className=Class.forName("java.util.Vector");
                                 
                                      Object object=className.newInstance();
                             
                                      createList = (List)object;
           
                                     
                                   }
                                   catch(ClassNotFoundException e)
                                   {
            
                                       throw new ProException(e);
        
                                   }
                                   catch(InstantiationException i)
                                   {
                                       i.printStackTrace();
                              
                                       
                                   }
                                   catch(IllegalAccessException a)
                                   {
                                      a.printStackTrace();
                                 
                                      
                                  }

                         }
                          
        return createList;
          
       
}




//loop ruuner


public void loopProcess(List inputList,Object[] args)throws ProException

{
        
        if(args==null)
        {
         throw new ProException("Object array can`t be null");
        }
        int length=args.length;
        for(int i=0;i<length;i++)
        {

             addObjectToList(inputList,args[i]);
         
        }


}



//indexof

public int toFindIndex(List inputList,Object inputObject)throws ProException
{

       Utility.validatorForObject(inputList);
       
       return inputList.indexOf(inputObject);
       
}


//lastIndexof

public int toFindLastIndex(List inputList,Object inputObject)throws ProException
{

       Utility.validatorForObject(inputList);
       
       return inputList.lastIndexOf(inputObject);
       
}


//get method

public Object toFindObject(List inputList,int indexValue)throws ProException
{

       Utility.validatorForObject(inputList);
       
       int sizeOfList=findSizeOfList(inputList);
       
       Utility.indexRangeValidator(sizeOfList,indexValue);
       
       return inputList.get(indexValue);
       
}




// Size method


public int findSizeOfList(List inputList)throws ProException
{

       Utility.validatorForObject(inputList);
       
       return inputList.size();
       
}


//Contain method

public boolean  objectContainInList(List inputList,Object objectTofind)throws ProException
{

         Utility.validatorForObject(inputList);
         
         return inputList.contains(objectTofind);

}





// Add method object


public boolean  addObjectToList(List inputList,Object objectToAdd)throws ProException
{

         Utility.validatorForObject(inputList);
         
         return inputList.add(objectToAdd);

}

//Add all method


public boolean  joinTwoList(List firstInputList,List secondInputList)throws ProException
{

       Utility.validatorForObject(firstInputList);
       
       Utility.validatorForObject(secondInputList);
       
       return firstInputList.addAll(secondInputList);



}

// Add method object at specified index


public void addObjectToList(List inputList,Object objectToAdd,int indexNumber)throws ProException
{

          Utility.validatorForObject(inputList);
          
          int sizeOfList=findSizeOfList(inputList);
       
          Utility.indexRangeValidator(sizeOfList,indexNumber);
         
          inputList.add(indexNumber,objectToAdd);

}

//remove object 


public boolean removeObject(List inputList,Object objectToRemove)throws ProException

{

      Utility.validatorForObject(inputList);
      return inputList.remove(objectToRemove);




}



//remove object using its index number


public Object removeObject(List inputList,int indexOfObjectToRemove)throws ProException

{

       Utility.validatorForObject(inputList);
      
       int sizeOfList=findSizeOfList(inputList);
       
       Utility.indexRangeValidator(sizeOfList,indexOfObjectToRemove);
      
       return inputList.remove(indexOfObjectToRemove);




}

//remove all method



public boolean removeObject(List parentList,List childList )throws ProException

{

      Utility.validatorForObject(parentList);
      
      Utility.validatorForObject(childList);
      
      return parentList.removeAll(childList);




}


//clear method 

public void clearObject(List parentList)throws ProException

{

      Utility.validatorForObject(parentList);
      
      parentList.clear();




}




//retain all method

public boolean retainObject(List parentList,List childList )throws ProException

{

      Utility.validatorForObject(parentList);
      
      Utility.validatorForObject(childList);
      
      return parentList.retainAll(childList);




}




//subList Method

public List subListOfList(List inputList,int startIndex,int endIndex)throws ProException
{

    Utility.validatorForObject(inputList);
    int sizeOfList=findSizeOfList(inputList);
    Utility.indexRangeValidator(sizeOfList,startIndex);
    Utility.indexRangeValidator(sizeOfList,endIndex);
    Utility.RangeValidatorBetweenIndex(startIndex,endIndex);
    
    return inputList.subList(startIndex,endIndex);


}





//To add objects which is in array form

public List addObjectFromCmdLine(Object args[])throws ProException
{

        List createList = createList();
        
        loopProcess(createList,args);

        
         return createList;
}


// to add mixed = array object + object
public List addMixedObject(Object args1[],Object args2[],Object objectToAdd)throws ProException
{

        List createList = createList();

        loopProcess(createList,args1);
        
        loopProcess(createList,args2);
        
        addObjectToList(createList,objectToAdd);
        
        
         return createList;
}








//To add object

public List addCustomObject(Object objectToAdd)throws ProException
{

       List createList = createList();
       
       addObjectToList(createList,objectToAdd);
      
       return createList;



}
























}
