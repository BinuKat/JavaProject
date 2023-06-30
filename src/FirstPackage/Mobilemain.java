package FirstPackage;

public class Mobilemain {

	public static void main(String[] args) {
	
		//Instantiating a class 
MobilePhone samsung= new MobilePhone();
	samsung.brandName= "samsung";
	samsung.modelNumber=2020;
	samsung.isCameraPresent=true;
	}
//Invoking the method
samsung.makeCalls();
samsung.sendTextMessage();
	
}
