package operators_02;

public class CostCalculator {
    private int tipPercent;
    private double mealCost;
    private int taxPercent;

    public CostCalculator(double mealCost, int tipPercent, int taxPercent) {
        this.mealCost = mealCost;
        this.tipPercent = tipPercent;
        this.taxPercent = taxPercent;
    }

    public int getTotalCost() {
        return (int) Math.round(mealCost + mealCost * tipPercent / 100 + mealCost * taxPercent / 100);
    }

}
