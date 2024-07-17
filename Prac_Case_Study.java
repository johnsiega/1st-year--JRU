package FINALS;
import java.util.Arrays;
import java.util.Scanner;

public class Prac_Case_Study {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numArray = new int [10];
		int ArraySize = numArray.length;
		char menu;
		int w = 5;
		
		System.out.println("Please Input 10 Integers");
		for(int i = 0;i<numArray.length;i++) {
		
				numArray[i] = sc.nextInt();
					
		
		}
		
		  
		
		System.out.println("Menu:");
		System.out.println("A. Display the numbers." + "\n" + "B. Display the value indexes (0th, 2nd, 3rd, 6th, etc.)" + "\n" 
						+ "C. Display the values of odd indexes (1st, 3rd, 5th, 7th, etc)" + "\n" + "D. Display the number in Ascending Order." + "\n" 
						+ "E. Display the values in a Descending Order.");
	while (w > 0) {
		
		System.out.print("Please input a command: ");
			menu = sc.next().charAt(0);
				
				switch (menu) {		
				case 'A':
				Display(numArray);
				w--;
				break;
				case 'B':
				DisplayB(numArray);
				w--;
				break;
				case 'C':
				DisplayC(numArray);
				w--;
				break;
				case 'D':
				int[] tempArray1 = DisplayD(numArray, ArraySize);
				System.out.println("Display the values in Descending order: "); 
				for (int i=0;i<ArraySize;i++)
					System.out.print(tempArray1[i] + " ");
					System.out.println();
				w--;
				break;
				case 'E':
				int[] tempArray = DisplayE(numArray, ArraySize);
				System.out.println(" Display the values in Descending order:");
				for (int i=0;i<ArraySize;i++)
					System.out.print(tempArray[i] + " ");
					System.out.println();
				w--;
				break;


				default :
					System.out.println("Invalid Input Please Run it Again");
					w = 0;
					break;
			}
		}
		
		
	}
	
	public static void Display (int[] numArray) {
	System.out.println("Display the numbers: ");
		 for (int i = 0; i < numArray.length; i++) {
	            System.out.print(numArray[i] + " ");
	          
		 }
		
	}
		
	public static void DisplayB (int[] numArray) {
	System.out.println("Display the values of even indexes (0th, 2nd, 4th, 6th, etc): ");
		for (int i = 0; i<numArray.length;i+= 2) {
			System.out.print(numArray[i] + " ");
			
		}
		
	}
		
	public static void DisplayC (int [] numArray) {
	System.out.println("Display the values of odd indexes (1st, 3rd, 5th, 7th, etc): "); 
		for (int i = 1; i<numArray.length;i = i + 2) {
			System.out.print(numArray[i] + " ");
			
	}
	
	}
	public static int[] DisplayD (int[]numArray, int ArraySize ) {
	
	int[] tempArray1 = Arrays.copyOf(numArray, ArraySize);
	int i, j, temp;
	for (i = (ArraySize-1); i>= 0; i--) {
		for(j = 1; j<=i;j++) {
			if(tempArray1[j-1] > tempArray1[j]) {
			temp = tempArray1[j-1];
			tempArray1[j-1] = tempArray1[j];
			tempArray1[j] = temp;
			}
		}
	}
	return tempArray1;		
}
	public static int[] DisplayE (int[]numArray, int ArraySize ) {
	
	 int[] tempArray = Arrays.copyOf(numArray, ArraySize);
	 int i, j, temp;
		for (i = (ArraySize-1); i>= 0; i--) {
			for(j = 1; j<=i;j++) {
				if(tempArray[j-1] < tempArray[j]) {
				temp = tempArray[j-1];
				tempArray[j-1] = tempArray[j];
				tempArray[j] = temp;
				
			
				}
			}
		}
		return tempArray;
				
	}
	
}
		
	


