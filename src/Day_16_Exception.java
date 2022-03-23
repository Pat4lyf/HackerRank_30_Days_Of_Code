import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem?isFullScreen=true
public class Day_16_Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        try {
            System.out.println(Integer.parseInt(s));
        } catch(Exception e) {
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
