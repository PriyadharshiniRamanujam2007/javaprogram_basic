
import java.util.*;

class car{
	String brand;
	String model;
	int orginal;
	int no_car;
	
	
	public  car(String brand, String model , int orginal , int no_car) {
		this.brand=brand;
		this.model=model;
		this.orginal=orginal;
		this.no_car=no_car;
		
	}
	
	
	
	public void available() {
		
		if(no_car>0) {
			System.out.println("\n\nWelcome Sir/Mam \n");
			System.out.println(no_car +" Car Available");
		}else {
			System.out.println("\n\n Welcome Sir/Mam \n");
			System.out.println("Sorry no Cars Available");
		}
		
	}
	
	public void rental() {
		if(no_car>0) {
			System.out.println("\n" +brand+" "+ model + " is Rented Successfully");
			no_car--;
			System.out.println(no_car +" Remaining Cars");
		}else {
			System.out.println("No Cars are available for Rental");
		}
	
	
	}
	
	
	public void returncar() {
		if(no_car<orginal) {
			System.out.println("Hope you have a Great day ");
			System.out.println("Sucessfully returned Car");
			no_car++;
		}else {
			System.out.println("I think You are Returning a Other car than our company \n Please ensure the right company");
		}
		
	}
}

	
public class Basic1{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			car car1=new car("Tata","punch",4,4);
			
			boolean flag=true;
			while(flag) {
				System.out.println("\n 1:Check Available \n 2:Car rent \n 3:Car return \n 4:Exit");
				System.out.println("Enter your choice:");
			
		    int choice=sc.nextInt();

			 switch(choice) {
			 
			 case 1:
				 car1.available();
				 break;
				 
			 case 2:
				 car1.rental();
				 break;
			 case 3:
				 car1.returncar();
				 break;
			 case 4:
				 flag=false;
				 System.out.println("Thank for choosing our Service \n Visit Again Soon :)");
			 }
	
		}sc.close();
	}
		 
	
}