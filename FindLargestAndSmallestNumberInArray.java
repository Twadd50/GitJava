
public class FindLargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		//create array of 10 numbers 
		int[] numbers = new int[] {2,5,7,3,12,20,17,14,21,15};
		//assign first and last element of array to largest 
		//and smallest number 
		
		int smallest = numbers[0];
		int largest  = numbers[0];
		
		for(int i=1; i < numbers.length; i++) {
			if(numbers[i] > largest) 
				largest = numbers[i];
		    else if(numbers[i] < smallest) 
				smallest = numbers[i];
			}
		System.out.println("largest number is: "   +largest);
		System.out.println("Smallest Number is : " +smallest);
		}
}

