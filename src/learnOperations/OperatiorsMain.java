package learnOperations;

public class OperatiorsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperators ao = new ArithmeticOperators();
		ao.num1 = 2;
		ao.num2 = 10;

		ao.addTwoNumbers();

		ao.num1 = 5;
		ao.num2 = 6;
		ao.addTwoNumbers();

		ao.num1 = 10;
		ao.num2 = 6;

		ao.subtractTwoNumbers();
//------------------------------------
		ao.multiplyTwoNumbers();
//----------------------------------------
		ArithmeticOperators ao1 = new ArithmeticOperators();

		ao1.num3 = 15.5;
		ao1.num4 = 3.2;
		ao1.divideTwoNumbers();

		ao1.addThreeNumbers();

	}

}
