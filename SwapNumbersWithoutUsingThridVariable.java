public class SwapNumbersWithoutUsingThridVariable {

	public static void main(String[]args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Before swapping");
		System.out.println("Value of num1 is: " +num1);
		System.out.println("Value of num2 is: " +num2);
		
		//add both the numbers and assign it to first
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Before swapping");
		System.out.println("Value of num1 is: " +num1);
		System.out.println("Value of num2 is: " +num2);
		
//		Output of Swap Numbers Without Using Third Variable example would be
//		Before Swapping
//		Value of num1 is :10
//		Value of num2 is :20
//		Before Swapping
//		Value of num1 is :20
//		Value of num2 is :10
	}
}
