package FINALS;
import java.util.Scanner;
import java.util.Arrays;

public class SortingStrings_BBL_DRIZZY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int numWords = scanner.nextInt();

        String[] words = new String[numWords];

        for (int i = 0; i < numWords; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = scanner.next();
        }

        System.out.println("\nWords in unsorted order:");
        for (String word : words) {
            System.out.println(word);
        }

        shellSort(words);

        System.out.println("\nWords in sorted order:");
        System.out.println(Arrays.toString(words));

        scanner.close();
    }

    public static void shellSort(String[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j >= gap &&
                        arr[j].compareTo(arr[j - gap]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j - gap] = temp;
                    j -= gap;
                }
            }
        }
    }
}