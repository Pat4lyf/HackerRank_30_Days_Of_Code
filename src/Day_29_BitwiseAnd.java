import java.io.*;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/30-bitwise-and/problem?isFullScreen=true
public class Day_29_BitwiseAnd {
    static class Result {

        /*
         * Complete the 'bitwiseAnd' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER N
         *  2. INTEGER K
         */

        public static int bitwiseAnd(int n, int k) {
            // Write your code here
            int max = Integer.MIN_VALUE;
            for (int i=1; i<n; i++) {
                for (int j=i+1; j<=n; j++) {
                    int value = i&j;
                    if (value > max && value < k) {
                        max = value;
                    }
                }
            }
            return max;
        }
    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int t = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, t).forEach(tItr -> {
                try {
                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                    int count = Integer.parseInt(firstMultipleInput[0]);

                    int lim = Integer.parseInt(firstMultipleInput[1]);

                    int res = Result.bitwiseAnd(count, lim);

                    bufferedWriter.write(String.valueOf(res));
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
