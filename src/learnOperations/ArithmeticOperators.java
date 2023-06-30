package learnOperations;

public class ArithmeticOperators {
	int num1;
	int num2;

	void addTwoNumbers() {

		int sum = num1 + num2;
		System.out.println("addition of two numbers is " + sum);
	}

	void subtractTwoNumbers() {
		int difference = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
	}

	void multiplyTwoNumbers() {
		int product = num1 * num2;
		System.out.println("pProduct of " + num1 + " and " + num2 + " is " + product);
	}

	// ----------------------------
	int num3;
	double num4;

	void divideTwoNumbers() {
		double quotient = num3 / num4;
		double remainder1 = num3 % num4;
		System.out.println("Quotient of " + num3 + " and " + num4 + " is " + quotient);
		System.out.println(" Remainder of " + num3 + " and " + num4 + " is " + remainder1);
	}

	// void divideTwoNumbers() {
	// double remainder1= num3 % num4;
	// System.out.println(" Remainder of "+num3+" and "+num4+" is " + remainder1);

	void addThreeNumbers() {
		// Reassign the value
		double num3 = 2.5;
		double num4 = 5.8;
		double num5 = 23.2;
		double sum = num3 + num4 + num5;
		System.out.println("Total of " + num3 + ", " + num4 + " and " + num5 + " is " + sum);
	}
}
