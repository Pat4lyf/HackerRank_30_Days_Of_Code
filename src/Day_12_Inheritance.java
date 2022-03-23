import java.util.Scanner;

public class Day_12_Inheritance {
    //    https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true
    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }

    static class Student extends Person {
        private int[] testScores;

        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here
        public Student(String firstName, String lastName, int id, int[] scores) {
            super(firstName, lastName, id);
            this.testScores = scores;
        }

        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here
        public String calculate() {
            int sum = 0;
            int size = this.testScores.length;
            for (int i = 0; i < size; i++) {
                sum += this.testScores[i];
            }
            int average = sum / size;
            if (average >= 90 && average <= 100) {
                return "O";
            } else if (average >= 80 && average < 90) {
                return "E";
            } else if (average >= 70 && average < 80) {
                return "A";
            } else if (average >= 55 && average < 70) {
                return "P";
            } else if (average >= 40 && average < 55) {
                return "D";
            } else {
                return "T";
            }
        }
    }
}
    class Solution2 {
        public static void main(String[] args) {
            System.out.println("Enter the firstName, lastName and idNumber separated by space:");
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
            int id = scan.nextInt();
            System.out.println("Enter the number of test scores:");
            int numScores = scan.nextInt();
            System.out.println("Enter the test scores separated by space:");
            int[] testScores = new int[numScores];
            for(int i = 0; i < numScores; i++){
                testScores[i] = scan.nextInt();
            }
            scan.close();

            Day_12_Inheritance.Student s = new Day_12_Inheritance.Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate() );
        }
    }

