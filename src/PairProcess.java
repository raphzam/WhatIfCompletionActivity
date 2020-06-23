import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {

//        DECLARING VARIABLES

        int num1, num2, sum, product;
        double average;
        Scanner keyboard = new Scanner(System.in);

//        GETTING INPUT

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        product = num1 * num2;



//        OUTPUT

        average = sum/2;
        if (sum > 200){
            System.out.printf("Sum: %d *\n", sum);
        } else {
            System.out.printf("Sum: %d\n", sum);
        }
        System.out.printf("Product: %d\n", product);
        System.out.printf("Average: %.2f\n", average);





    }

}