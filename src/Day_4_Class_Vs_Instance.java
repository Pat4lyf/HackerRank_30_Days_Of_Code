import java.util.Scanner;
//https://www.hackerrank.com/challenges/30-class-vs-instance/problem?isFullScreen=true
public class Day_4_Class_Vs_Instance {
    static class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge < 0) {
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                this.age = initialAge;
            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if(age < 13) {
                System.out.println("You are young.");
            } else if(age >= 18) {
                System.out.println("You are old.");
            } else {
                System.out.println("You are a teenager.");
            }
        }

        public void yearPasses() {
            // Increment this person's age.
            this.age++;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of test cases");
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                System.out.println("Enter a person's age");
                int age = sc.nextInt();
                Person p = new Person(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
            sc.close();
        }
    }
}
