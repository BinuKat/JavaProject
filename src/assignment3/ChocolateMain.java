package assignment3;

public class ChocolateMain {

	public static void main(String[] args) {
	

	int initialChocolates = 27;
	int maxChocolates = 63;
	int addChocolates = 5;
    int chocolatesBox = initialChocolates + addChocolates;
    
    
	if(maxChocolates < chocolatesBox) {
		maxChocolates = chocolatesBox;
	  System.out.println("filledMax");
	} else {
		System.out.println("Number of Chocolates added in the box " + addChocolates);
	}
	System.out.println("Chocolates in the box = " + maxChocolates);
	}

}
