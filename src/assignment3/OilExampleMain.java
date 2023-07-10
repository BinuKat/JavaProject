package assignment3;

public class OilExampleMain {

	public static void main(String[] args) {
		OilExample filledOil = new OilExample();
			int tankCap= 520;
			int bucketCap= 15;
		int filledTank = 0;
		int buckUsed= 0;
		
		while (filledTank < tankCap){
			if (filledTank + bucketCap <= tankCap){
			filledTank += bucketCap;
			buckUsed++;
			System.out.println(" Filled the tank with bucket of oil " + filledTank);
		} else {
			System.out.println(" Stopping the filling process");
		
			break;
		}
		}
			
	      System.out.println("Filled "+filledOil+" litres of oil using "+buckUsed+" buckets.");

}}

