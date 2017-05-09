package recursion_09;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(factorial(number));
    }

    private static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        int result = factorial(number - 1) * number;
        return result;
    }

}
