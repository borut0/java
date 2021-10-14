import java.util.Scanner;
public class prac8
{
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();						// number=8
		int index = 2; // Numbers to test as factors 

		// Find and display all the smallest factors in increasing order
		while (number / index != 1) {						// 8/2=4 !=1
			// Test as a factor of number
			if (number % index  == 0) {					// 8/2==0
				System.out.print(index + ", ");				// 2,
				number = number/index; 					// 8/2=4,
			}
			else
				index++; // Increment index
		
		}
		System.out.println(number + ".");
	}
}