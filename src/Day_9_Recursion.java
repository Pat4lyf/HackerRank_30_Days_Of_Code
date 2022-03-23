import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.hackerrank.com/challenges/30-recursion/problem?isFullScreen=true
public class Day_9_Recursion {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

}

class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value:");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Day_9_Recursion.factorial(n);
        System.out.println(result);

        bufferedReader.close();
    }

}


