package FINALS;
import java.util.Arrays;
import java.util.Scanner;

public class SortingLetters_GroupName {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of letters: ");
	        int numLetters = scanner.nextInt();

	        String[] letters = new String[numLetters];

	        for (int i = 0; i < numLetters; i++) {
	            System.out.print("Enter letter " + (i + 1) + ": ");
	            letters[i] = scanner.next();
	        }

	        System.out.println("\nLetters in unsorted order:");
	        for (String letter : letters) {
	            System.out.println(letter);
	        }

	        shellSort(letters);

	        System.out.println("\nLetters in sorted order:");
	        System.out.println(Arrays.toString(letters));

	        scanner.close();

	    }

	    public static void shellSort(String[] arr) {
	        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
	            for (int i = gap; i < arr.length; i++) {
	                int j = i;
	                while (j >= gap && arr[j].compareTo(arr[j - gap]) < 0) {
	                    String temp = arr[j];
	                    arr[j] = arr[j - gap];
	                    arr[j - gap] = temp;
	                    j -= gap;
	                }
	            }
	        }
	    }
	}
