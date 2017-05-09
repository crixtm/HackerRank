package scope_14;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        maximumDifference = maxElement() - minElement();
    }

    private int minElement() {
        int min = 10;
        for (int value : elements){
            if (min > value){
                min = value;
            }
        }
        return min;
    }

    private int maxElement() {
        int max= 0;
        for (int value : elements){
            if (max < value ){
                max = value;
            }
        }
        return max;
    }
}