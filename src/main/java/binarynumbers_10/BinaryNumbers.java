package binarynumbers_10;

import java.util.Scanner;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(numberOfConsecutiveOnes(number));
    }

    private static int numberOfConsecutiveOnes(int number) {
        String binaryString = Integer.toBinaryString(number);
        int biggestCounter = 0;
        int counter = 0;
        int stringPointer = 0;
        do {
            if (binaryString.charAt(stringPointer) == '1' ){
                counter++;
            } else {
                counter = 0;
            }
            if (counter > biggestCounter) {
                biggestCounter = counter;
            }
            stringPointer++;
        } while (stringPointer < binaryString.length());
        return biggestCounter == 0 ? counter : biggestCounter;
    }
}
