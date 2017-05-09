package inheritance_12;
class Student extends Person{
    private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }



    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
        if (90 <= averageTestScore()){
            return 'O';
        }
        if (90 > averageTestScore() && 80 <= averageTestScore()){
            return 'E';
        }
        if (80 > averageTestScore() && 70 <= averageTestScore()){
            return 'A';
        }
        if (70 > averageTestScore() && 55 <= averageTestScore()){
            return 'P';
        }
        if (55 > averageTestScore() && 40 <= averageTestScore()){
            return 'D';
        } else {
            return 'T';
        }
    }

    private int averageTestScore() {
        int sum = 0;
        for (int value : testScores) {
            sum += value;
        }
        return sum / testScores.length;
    }
}