import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int total  = 0;
		int counter = 1;
		
		System.out.print("Enter number: ");
		num = input.nextInt();
		
		do {
			if(num%counter == 0) {
				total += counter;
			}
			counter++;
		} while(counter < num);
		
		if(total!=num || num == 1) {
			System.out.println(num + " is not a member of perfect numbers!");
		} else {
			System.out.println(num + " is a member of perfect numbers!");
		}
	}
}
