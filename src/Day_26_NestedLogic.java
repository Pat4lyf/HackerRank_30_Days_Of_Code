import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-nested-logic/problem?isFullScreen=true
public class Day_26_NestedLogic {
    public static class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);

            int returnedDay = scanner.nextInt();
            int returnedMonth = scanner.nextInt();
            int returnedYear = scanner.nextInt();

            int dueDay = scanner.nextInt();
            int dueMonth = scanner.nextInt();
            int dueYear = scanner.nextInt();

            if (returnedYear > dueYear) {
                System.out.println("10000");
            } else if (returnedYear == dueYear && returnedMonth > dueMonth) {
                int numberOfMonthsLate = returnedMonth - dueMonth;
                int fine = 500 * numberOfMonthsLate;
                System.out.println(String.valueOf(fine));
            } else if (returnedYear == dueYear && returnedMonth == dueMonth && returnedDay > dueDay) {
                int numberOfDaysLate = returnedDay - dueDay;
                int fine = 15 * numberOfDaysLate;
                System.out.println(String.valueOf(fine));
            } else {
                System.out.println("0");
            }

            scanner.close();

        }
    }
}
