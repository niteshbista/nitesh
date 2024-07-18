import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        int cash;
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter the number");
        cash=sc.nextInt();

        if(cash >= 1000) {
            int temp = cash/1000;
            cash = cash%1000;
            System.out.println("The no of thousands you get back is:" + temp);
        }
        if (cash >= 500) {
            int temp = cash/500;
            cash = cash%500;
            System.out.println("The no of fivethousands you get back is:" + temp);
        }
        if (cash >= 100) {
            int temp = cash/100;
            cash = cash%100;
            System.out.println("The no of hundreds you get back is:" + temp);
        }
           if (cash >= 50) {
               int temp = cash/50;
               cash = cash%50;
               System.out.println("The no of fiftys you get back is:" + temp);

           }
        if (cash >= 10) {
            int temp = cash/10;
            cash = cash%10;
            System.out.println("The no of tens  you get back is:" + temp);

        }
        if (cash >= 5) {
            int temp = cash/5;
            cash = cash%5;
            System.out.println("The no of fives you get back is:" + temp);
        }
    }

    }




