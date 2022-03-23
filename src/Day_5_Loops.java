import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.hackerrank.com/challenges/30-loops/problem?isFullScreen=true
public class Day_5_Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i=1; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
        bufferedReader.close();
    }
}
