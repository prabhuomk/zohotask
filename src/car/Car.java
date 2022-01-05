package car;

public class Car {
	
	public Car() {}
	
	public Car(String input) {
		
		System.out.println(input);
		
	}

	
		
		private int yearOfMake;
		
		private String engineNumber;
		
		private String type;
		
		public void setYear(int yearOfMake) {
			
			this.yearOfMake=yearOfMake;
			
			
			
		}
		
       public void setNumber(String engineNumber) {
				
			this.engineNumber=engineNumber;
				
		}
        public void setType(String type) {
	
	           this.type=type;
	
        }
		
		public int getYear()
		{
			return this.yearOfMake;
		}
		
		public String getNumber()
		{
			return this.engineNumber;
		}
		
		public String getType()
		{
			return this.type;
		}
		
		public void maintenance()
		{
			System.out.println("Car under maintenance");
		}
	

}

