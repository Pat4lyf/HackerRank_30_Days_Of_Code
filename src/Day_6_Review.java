import java.util.Scanner;
//https://www.hackerrank.com/challenges/30-review-loop/problem?isFullScreen=true
public class Day_6_Review {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int numberOfTestCases = scanner.nextInt();
        for (int i=0; i < numberOfTestCases; i++) {
            System.out.println("Enter a test case");
            while (scanner.hasNext()) {
                String testCase = scanner.next();
                String evenString = "";
                String oddString = "";

                for (int j=0; j<testCase.length(); j++) {
                    if (j%2 == 0) {
                        evenString += testCase.charAt(j);
                    } else {
                        oddString += testCase.charAt(j);
                    }
                }

                System.out.println(evenString + " " + oddString);
            }
        }
    }
}
