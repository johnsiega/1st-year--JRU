package FINALS;

import java.util.Scanner;

public class BblDrizzyLotto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] InputNum = new int[6];
        int[] winningNumbers = new int[6];
        int matchedNum = 0;

        System.out.println("Please Input 6 Possible Winning Numbers between 0 - 42");

        for (int i = 0; i < InputNum.length; i++) {
            InputNum[i] = sc.nextInt();
            if (InputNum[i] > 42) {
                System.out.println("Invalid Input, please input a number between 0 - 42");
                i = -1;
            }
        } 

        System.out.print("The Winning Numbers Are: ");
        GenerateWinningNum(winningNumbers);

        matchedNum = CheckWinnings(InputNum, winningNumbers);

        switch (matchedNum) {
            case 6:
                System.out.println("Congratulations! You've won the Minimum Jackpot prize of P9 Million!");
                break;
            case 5:
                System.out.println("Congratulations! You've won P25,000.00!");
                break;
            case 4:
                System.out.println("Congratulations! You've won P1,000.00!");
                break;
            case 3:
                System.out.println("Congratulations! You've won P20.00!");
                break;
            default:
                System.out.println("Sorry, you didn't win this time.");
                break;
        }
    }

    public static void GenerateWinningNum(int[] winningNumbers) {
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = 1 + (int) (Math.random() * 42);
            System.out.print(winningNumbers[i] + " ");
        }
        System.out.println();
    }

    public static int CheckWinnings(int[] InputNum, int[] winningNumbers) {
        int matchedNum = 0;
        for (int i = 0; i < InputNum.length; i++) {
            for (int j = 0; j < winningNumbers.length; j++) {
                if (InputNum[i] == winningNumbers[j]) {
                    matchedNum++;
                    break; 
                }
            }
        }
        return matchedNum;
    }
}
