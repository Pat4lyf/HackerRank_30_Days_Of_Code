import java.util.Scanner;
//https://www.hackerrank.com/challenges/30-generics/problem?isFullScreen=true
public class Day_21_Generics {
    static class Printer <T> {

        /**
         *    Method Name: printArray
         *    Print each element of the generic array on a new line. Do not return anything.
         *    @param arr generic array
         **/

        // Write your code here
        void printArray(T[] arr) {
            for (T a: arr) {
                System.out.println(a);
            }
        }

    }

    public static class Generics {

        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            Integer[] intArray = new Integer[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = scanner.nextInt();
            }

            n = scanner.nextInt();
            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = scanner.next();
            }

            Printer<Integer> intPrinter = new Printer<Integer>();
            Printer<String> stringPrinter = new Printer<String>();
            intPrinter.printArray( intArray  );
            stringPrinter.printArray( stringArray );
            if(Printer.class.getDeclaredMethods().length > 1){
                System.out.println("The Printer class should only have 1 method named printArray.");
            }
        }
    }
}
