import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-scope/problem?isFullScreen=true
public class Day_14_Scope {
    static class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        Difference(int[] elements) {
            this.elements = elements;
        }

        void computeDifference() {
            for (int i = 0; i < this.elements.length; i++) {
                for (int j = i + 1; j < this.elements.length; j++) {
                    int difference = Math.abs(this.elements[i] - this.elements[j]);
                    maximumDifference = Math.max(difference, maximumDifference);
                }
            }
        }

    } // End of Difference class
}

class Solution4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Day_14_Scope.Difference difference = new Day_14_Scope.Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
}
