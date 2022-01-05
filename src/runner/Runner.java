package runner;

import swift.Swift;
import scross.SCross;
import xuv.XUV;
import myscanner.MyScanner;
import proexception.ProException;
import car.Car;
import bird.BirdAbstract;
import parrot.ParrotMod;
import duck.Duck;

public class Runner 

{
	
	Swift car = new Swift();
	
	SCross delta = new SCross();
	
	MyScanner input = new MyScanner();
	

    private void swiftCar()
    {
	
       try 
       {
	
	          int year=input.getInputNumber("Enter the year of the car");
	          
	          car.setYear(year);
	          
	          String engineNumber=input.getInput("Enter the Engine Number");
	          
	          car.setNumber(engineNumber);
	          
	          String type=input.getInput("Enter the type");
	          
	          car.setType(type);
	          
	          System.out.println("the year of the car"+" "+car.getYear());
	          
	          System.out.println("he Engine Number"+" "+car.getNumber());
	          
	          System.out.println("the type"+" "+car.getType());
	
	
      }
      catch(ProException e)
      {
	
	          System.out.println(e.getMessage());
	
      }



    }

    private void scrossCar()
    {
	
      try 
      {
	
	        int year=input.getInputNumber("Enter the year of the car");
	
	        delta.setYear(year);
	
	        String engineNumber=input.getInput("Enter the Engine Number");
	
	        delta.setNumber(engineNumber);
	
	        String type=input.getInput("Enter the type");
	
	        delta.setType(type);
	
	        int seat=input.getInputNumber("Enter the number of seat");
	
	        delta.setSeat(seat);
	
	        int bag=input.getInputNumber("Enter the number of airbgs");
	
	        delta.setAirbag(bag);
	
	        String model=input.getInput("Enter the model name");
	
	        delta.setModel(model);
	
	        String color=input.getInput("Enter the color");
	
	        delta.setColor(color);
	
	        System.out.println("the year of the car"+" "+delta.getYear());
	
	        System.out.println("he Engine Number"+" "+delta.getNumber());
	
	        System.out.println("the type"+" "+delta.getType());
	
	        System.out.println("the number of seat"+" "+delta.getSeat());
	
	        System.out.println("number of airbgs"+" "+delta.getAirbag());
	
	        System.out.println("the model name"+" "+delta.getModel());
	
	        System.out.println("the color"+" "+delta.getColor());
			
     }
     catch(ProException e) 
     {
	
	         System.out.println(e.getMessage());
	
     }

  }


  private  void runCar(Car input)
  {
	
	System.out.println(input);
	
  }

  private  void checkCar(Car input)
  {
	
	if(input instanceof Swift)
	{
		System.out.println("Hatch");
	}
	else if (input instanceof SCross)
	{
		System.out.println("Sedan");
	}
	else if (input instanceof XUV)
	{
		System.out.println("SUV");
	}
	else
	{
		System.out.println("new type added");
		
	}
	
  }

  private void swiftCar(Swift inputCar)
  {
	
	System.out.println("Swift");
	
  }

  private void duckBird()
  {
	  Duck bird = new Duck();
      bird.fly();
      bird.speak();
  }
  
  private void parrotBird()
  {
	//BirdAbstract nest = new BirdAbstract();
	   ParrotMod pet = new ParrotMod();
      pet.fly();
      pet.speak();
	  
  }

public static void main(String[] args) {
		
	Runner run = new Runner();
	
	Car car = new Car();
      
	Swift demoSwift = new Swift();
	
	Car swiftCar = new Swift();
	
	SCross demoSCross = new SCross();
	
	Car scrossCar = new SCross();
	
	XUV demoXUV = new XUV("hai");
	
    MyScanner input = new MyScanner();
		
	int caseNumber=input.getInputNumber("Enter the task number");
	
	switch(caseNumber)
	{
	
	case 1:System.out.println("hai");
	break;
	
	case 2:run.swiftCar();
	break;
	
	case 3:run.scrossCar();
	break;
	
	case 4:run.runCar(demoSwift);
	run.runCar(demoSCross);
	break;
	
	case 5:run.checkCar(demoSwift);
	run.checkCar(demoSCross);
	run.checkCar(demoXUV);
	break;
	
	case 6:run.swiftCar(demoSwift);
	//run.swiftCar(swiftCar);
	//run.swiftCar(demoSCross);
	//run.swiftCar(demoXUV);
	break;
	
	case 7:
		   demoSCross.maintenance();
	       scrossCar.maintenance();
	       car.maintenance();
	       demoSwift.maintenance();
	break;
	
	case 8:XUV obj=new XUV("bye");
	break;
		
	
	
	case 9:run.parrotBird();
    break;      
	
	case 10:run.duckBird();
	break;
		
	
	
	
	}
		
		
		
		
	

	}

}
