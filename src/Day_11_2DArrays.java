import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/30-2d-arrays/problem
public class Day_11_2DArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i=0; i<=arr.size()-3; i++) {
            for (int j=0; j<=arr.get(i).size()-3; j++) {
                sum = 0;
                //top row
                sum += arr.get(i).get(j);
                sum += arr.get(i).get(j+1);
                sum += arr.get(i).get(j+2);

                //middle row
                sum += arr.get(i+1).get(j+1);

                //bottom row
                sum += arr.get(i+2).get(j);
                sum += arr.get(i+2).get(j+1);
                sum += arr.get(i+2).get(j+2);

                //get the maximum sum
                maxSum = Math.max(sum, maxSum);

            }
        }
        System.out.println(maxSum);

        bufferedReader.close();
    }
}
