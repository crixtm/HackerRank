package array2d_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        final int GRID_SIZE = 6;
        int arr[][] = new int[GRID_SIZE][GRID_SIZE];
        for(int i=0; i < GRID_SIZE; i++){
            for(int j=0; j < GRID_SIZE; j++){
                arr[i][j] = rnd.nextInt(5);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(biggestHourGlassSum(arr));
    }

    private static int biggestHourGlassSum(int[][] arr) {
        List <Integer> sums = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++){
            for (int j = 0; j < arr[i].length - 2; j++){
                sums.add(arr [i][j] + arr [i][j+1] + arr [i][j+2] +
                        arr [i+1][j+1] +
                        arr [i+2][j] + arr [i+2][j+1] + arr [i+2][j+2]);
                System.out.println(" " +arr [i][j] + arr [i][j+1] + arr [i][j+2]);
                System.out.println("  " + arr [i+1][j+1]);
                System.out.println(" " + arr [i+2][j] + arr [i+2][j+1] + arr [i+2][j+2]);
                System.out.println(arr [i][j] + arr [i][j+1] + arr [i][j+2] +
                        arr [i+1][j+1] +
                        arr [i+2][j] + arr [i+2][j+1] + arr [i+2][j+2]);
            }
        }

        return maxSum(sums);
    }

    private static int maxSum(List<Integer> sums) {
        int maxSum = sums.get(0);
        for (Integer value : sums) {
            if (maxSum<value){
                maxSum = value;
            }
        }
        return maxSum;
    }
}
