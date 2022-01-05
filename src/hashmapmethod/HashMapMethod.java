package hashmapmethod;
import java.util.*;
import proexception.ProException;
import utility.Utility;



public class HashMapMethod{







//Method- to create map 

public Map<Object,Object> createMap()
{

               Map<Object,Object> myMap=new HashMap<Object,Object>();
               
               return myMap;

}


//Method-to find size

public int sizeOfMap(Map<Object,Object> inputMap)throws ProException
{
               Utility.validatorForObject(inputMap);
               
               return inputMap.size();
}




//Method-to put key and value

public Object putKeyValue(Map<Object,Object> inputMap,Object key,Object value)throws ProException
{

              Utility.validatorForObject(inputMap);
              
              return inputMap.put(key,value);

}

//Method-to check presence of key

public boolean checkKey(Map<Object,Object> inputMap,Object key)throws ProException
{


             Utility.validatorForObject(inputMap);
             
             return inputMap.containsKey(key);


}

//Method-to check presence of value

public boolean checkValue(Map<Object,Object> inputMap,Object value)throws ProException
{


             Utility.validatorForObject(inputMap);
             
             return inputMap.containsValue(value);


}

//Method-to replace value for a key 

public Object replaceValue(Map<Object,Object> inputMap,Object key,Object value)throws ProException
{

              Utility.validatorForObject(inputMap);
              
              return inputMap.replace(key,value);

}


//Method-to replace value for a key based on old value of the key

public boolean replaceValue(Map<Object,Object> inputMap,Object key,Object oldValue,Object newValue)throws ProException
{

              Utility.validatorForObject(inputMap);
              
              return inputMap.replace(key,oldValue,newValue);

}






//Method-to get value for a key 

public Object getValue(Map<Object,Object> inputMap,Object key)throws ProException
{

              Utility.validatorForObject(inputMap);
              
              return inputMap.get(key);

}


//Method-to get value for a key 

public Object getDefaultValue(Map<Object,Object> inputMap,Object key,Object defaultValue)throws ProException
{

              Utility.validatorForObject(inputMap);
              
              return inputMap.getOrDefault(key,defaultValue);

}
//Method-to remove key 

public Object removeKey(Map<Object,Object> inputMap,Object key)throws ProException
{

              Utility.validatorForObject(inputMap);
              
              return inputMap.remove(key);

}

//Method-to remove key based on value 

public boolean removeKey(Map<Object,Object> inputMap,Object key,Object Value)throws ProException
{

              Utility.validatorForObject(inputMap);
              
              return inputMap.remove(key,Value);

}



//Method to remove all



public void removeAll(Map<Object,Object> inputMap)throws ProException
{

              Utility.validatorForObject(inputMap);
              
              inputMap.clear();

}

//Method to transfer from one hashmap to another

public void transfer(Map<Object,Object> sourceMap,Map<Object,Object> destinationMap)throws ProException
{

              
              Utility.validatorForObject(sourceMap);
              
              Utility.validatorForObject(destinationMap);
              
              destinationMap.putAll(sourceMap);

}




}
