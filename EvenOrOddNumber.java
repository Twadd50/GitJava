
public class EvenOrOddNumber {

	public static void main(String[]args) {
		//create array of 10 numbers 
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < numbers.length; i++) {
			//use modulo to check if the number is even or odd
			//if we divide by any number by 2 and remainder is 0,
			//then the number is even, else it is odd.
			
			if(numbers[i]%2 == 0) {
				System.out.println(numbers[i] + " is even number.");
			}	else {
					System.out.println(numbers[i] + " is odd number");
			}
		}
	}
}
