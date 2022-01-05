package forenum;



public class ForEnum{


public enum Color
{

             VIOLET,INDIGO,BLUE,GREEN,YELLOW,ORANGE,RED;

             
             
             
             public int getColorCode()
             {
               
               return ordinal()+1;
             
             }

}

public static void main(String[] args){

int code=Color.VIOLET.getColorCode();

//internal working of above line - int code=new Color().getColorCode()



System.out.println("Color code of"+" "+Color.VIOLET+" "+"is"+" "+code);

Color[] data=Color.values();

for(int i=0;i<data.length;i++)
{

int codes=data[i].getColorCode();

System.out.println("Color code of"+" "+data[i]+" "+"is"+" "+codes);

}

}
}

