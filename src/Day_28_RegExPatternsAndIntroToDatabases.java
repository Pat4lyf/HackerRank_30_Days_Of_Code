import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/30-regex-patterns/problem?isFullScreen=true
public class Day_28_RegExPatternsAndIntroToDatabases {
    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());

            Map<String, String> map = new HashMap<>();

            IntStream.range(0, N).forEach(NItr -> {
                try {
                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                    String firstName = firstMultipleInput[0];

                    String emailID = firstMultipleInput[1];

                    map.put(emailID, firstName);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            List<String> firstNameList = new ArrayList<>();

            for (Map.Entry<String, String> each: map.entrySet()) {
                if(each.getKey().endsWith("@gmail.com")) {
                    firstNameList.add(each.getValue());
                }
            }

            firstNameList.stream().sorted().forEach(System.out::println);

            bufferedReader.close();
        }
    }
}
