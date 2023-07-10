package assignment3;

public class WaterQueryMain {

	public static void main(String[] args) {
		 final int tankCapacity = 100;
		    final int bucketCapacity = 10;

		  
		        int filledWater = 0;
		        int bucketsUsed = 0;

		        while (filledWater < tankCapacity) {
		            if (filledWater + bucketCapacity <= tankCapacity) {
		                filledWater += bucketCapacity;
		                bucketsUsed++;
		                System.out.println("Filled the tank with a bucket of water."+ filledWater);
		            } else {
		                System.out.println("Tank is full. Stopping the filling process.");
		                break;
		            }
		        }

		        System.out.println("Filled " + filledWater + " litres of water using " + bucketsUsed + " buckets."); 
		    }
		}