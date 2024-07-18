import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        int cash;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        cash = sc.nextInt();

        if (cash < 100) {
            int temp= cash/1000;
            cash= cash%1000;
            System.out.println("The number of hundred you get back is:" + temp );
        }
         if (cash>= 500){
             int temp= cash/500;
             cash= cash%500;
             System.out.println(" the no of the five hundreds you get back is:"+ temp);
         }
         if (cash>= 100){
             int temp= cash/100;
             cash= cash%100;
             System.out.println(" the number of hundred you get back is: "+ temp);
         }
         if (cash>= 50){
             int temp= cash/50;
             cash= cash%50;
             System.out.println(" the amount of fiftees you get back is"+ temp);
         }
         if (cash>= 10){
             int temp= cash/10;
             cash= cash%10;
             System.out.println("the no of tens you get back is:"+ temp);
         }
         if (cash>= 5){
             int temp= cash/5;
             cash= cash%5;
             System.out.println("the amount if fives you get back is:"+ temp);

         }
    }

}
