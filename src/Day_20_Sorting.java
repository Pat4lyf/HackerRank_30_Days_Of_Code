import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/30-sorting/problem?isFullScreen=true
public class Day_20_Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        int totalNumberOfSwaps = 0;
        for(int i=0; i<n; i++) {
            //Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            for (int j=0; j<n-1; j++) {
                //swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j+1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is already sorted
            if (numberOfSwaps == 0) break;
            totalNumberOfSwaps += numberOfSwaps;
        }

        System.out.printf("Array is sorted in %d swaps.", totalNumberOfSwaps);
        System.out.println();
        System.out.printf("First Element: %d", a.get(0));
        System.out.println();
        System.out.printf("Last Element: %d", a.get(a.size()-1));
        bufferedReader.close();
    }
}
