import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem?isFullScreen=true
public class Day_25_RunningTimeAndComplexity {
    public static class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            for(int i=0; i<n; i++) {
                int val = scanner.nextInt();

                for(int j=2; j<=Math.sqrt(val); j++) {
                    if (val%j == 0) {
                        val = 1;
                    }
                }

                if (val == 1) {
                    System.out.println("Not prime");
                } else {
                    System.out.println("Prime");
                }
            }
            scanner.close();
        }
    }
}
