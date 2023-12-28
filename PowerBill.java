import java.util.Scanner;
public class PowerBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Scanner sc=new Scanner(System.in); 
			System.out.println("ENTER UNITS CONSUMED");
			 double units;
			 units=sc.nextDouble();
			 if (units<=0)
			 {
				
				 System.out.println("BILL AMOUNT=25");
				 }
			 else if (units<=100)
			 {
				
				 System.out.println("BILL AMOUNT=" + (25+units*2.6));
				 }
			 
			 else if(units>=100&&units<=300)
			 {
				 System.out.println("BILL AMOUNT=" + (50+units*3.35));
				 }
			 
			 else if(units>=300&&units<=500) 
			 {
				 System.out.println("BILL AMOUNT=" + (75+units*5.4));
				 }
			 else if(units>=500) 
			 {
				 System.out.println("BILL AMOUNT=" + (100+units*8.5));
				 }

	}

}
