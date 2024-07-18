import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        int cash;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        cash = sc.nextInt();

        if(cash >= 1000) {
            int temp = cash/1000;
            cash = cash%1000;
            System.out.println("The no of thousands you get back is:" + temp);
        }
        if (cash >=500){
            int temp1 = cash/500;
            cash = cash%500;
            System.out.println("The no of fivehundreds you get back is:" + temp1);
        }
        if (cash >=100){
            int temp2 = cash/100;
            cash = cash%100;
            System.out.println("The no of hundreds you get back is:" + temp2);
        }
        if (cash >=50){
            int temp3 = cash/50;
            cash = cash%50;
            System.out.println("The amount of fifties you get back is:" + temp3);
        }
        if (cash >=10){
            int temp4 = cash/10;
            cash = cash%10;
            System.out.println("The no of tens you get back is:" + temp4);
        }
        if (cash >=5){
            int temp5 = cash/5;
            cash = cash%5;
            System.out.println("The amount of fives you get back is:" + temp5);
        }

    }
}
