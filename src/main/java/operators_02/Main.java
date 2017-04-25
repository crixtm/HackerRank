package operators_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CostCalculator costCalculator = new CostCalculator(getMealCost(), getTipPercent(), getTaxPercent());
        System.out.println(costCalculator.getTotalCost());
    }

    //this method is same as the other percent getter method, but added for future maintainability
    private static int getTaxPercent() {
        return getTipPercent();
    }

    private static int getTipPercent() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static double getMealCost() {
        Scanner sc = new Scanner(System.in);
        return Double.valueOf(sc.nextLine());
    }
}
