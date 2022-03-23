import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_10_BinaryNumbers {
//    https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binaryString = "";
        while (n != 0) {
            int mod = n%2;
            n = n/2;
            binaryString += String.valueOf(mod);
        }

        int max = 0;
        int count = 0;
        for(int i=0; i<binaryString.length(); i++) {
            if(binaryString.charAt(i) == '0') {
                count = 0;
            } else {
                count++;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);

        bufferedReader.close();
    }
}
