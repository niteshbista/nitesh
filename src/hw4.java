import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of cash: ");
        int cash = sc.nextInt(); // Initialize cash with user input

        if (cash >= 1000) {
            int temp = cash / 1000;
            cash = cash % 1000;
            System.out.println("Number of thousands you get back: " + temp);
        }
        if (cash >= 500) {
            int temp = cash / 500;
            cash = cash % 500;
            System.out.println("Number of five hundreds you get back: " + temp);
        }
        if (cash >= 100) {
            int temp = cash / 100;
            cash = cash % 100;
            System.out.println("Number of hundreds you get back: " + temp);
        }
        if (cash >= 50) {
            int temp = cash / 50;
            cash = cash % 50;
            System.out.println("Number of fifties you get back: " + temp);
        }
        if (cash >= 10) {
            int temp = cash / 10;
            cash = cash % 10;
            System.out.println("Number of tens you get back: " + temp);
        }
        if (cash >= 5) {
            int temp = cash / 5;
            cash = cash % 5;
            System.out.println("Number of fives you get back: " + temp);
        }
    }
}
