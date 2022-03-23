import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.hackerrank.com/challenges/30-operators/problem?isFullScreen=true
public class Day_2_Operators {
    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        // Write your code here
        double tip = (tipPercent * mealCost) / 100;
        double tax = (taxPercent * mealCost) / 100;
        double mealTotalCost = tip + tax + mealCost;
        System.out.print(Math.round(mealTotalCost));
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the cost of the meal");
        double mealCost = Double.parseDouble(bufferedReader.readLine().trim());

        System.out.println("Enter the percentage of the tip");
        int tipPercent = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("Enter the percentage of tax");
        int taxPercent = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("The meal total cost is:");
        Day_2_Operators.solve(mealCost, tipPercent, taxPercent);

        bufferedReader.close();
    }
}

