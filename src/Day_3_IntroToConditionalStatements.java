import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.hackerrank.com/challenges/30-conditional-statements/problem?isFullScreen=true
public class Day_3_IntroToConditionalStatements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        if(n%2 != 0 || n%2 == 0 && n>= 6 && n<=20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        bufferedReader.close();
    }
}
