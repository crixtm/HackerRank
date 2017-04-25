package lets_review_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class processStrings {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = Integer.valueOf(sc.nextLine());
        List <String> strings = new ArrayList<String>();
        List <String> processedStrings = new ArrayList<>();
        for (int i = 0; i < numberOfTestCases; i++){
            strings.add(sc.nextLine());
        }
        processedStrings = processList(strings);
        for (String stringtoShow : processedStrings) {
            System.out.println(stringtoShow);
        }
    }
    private static List<String> processList(List<String> list){
        List <String> result = new ArrayList<>();
        for (String stringToProcess : list) {
            result.add(getAllEvenCharacter(stringToProcess));
        }
            return result;
        }

    private static String getAllEvenCharacter(String stringToProcess) {
        String evenChars = "";
        String oddChars = "";
        for (int i = 0; i< stringToProcess.length(); i++) {
            if (0 == (i / 2) ){
                evenChars += stringToProcess.charAt(i);
            } else {
                oddChars += stringToProcess.charAt(i);
            }
        }
        return evenChars + " " + oddChars;
    }
}
