import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[][];
        System.out.println("Enter rows:");
        int rows = input.nextInt();
        System.out.println("Enter columns:");
        int columns = input.nextInt();
        array = new int[rows][columns];
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                System.out.println("Enter");
                array[row][column] = input.nextInt();
            }
        }
        for ( int i =0; i < array.length; i++)
            System.out.println(Arrays.toString(array[i]));
        int sum = 0;
        int index;
        System.out.println("Enter your column postion you want to sum: ");
        index = input.nextInt() - 1 ;
        for (int i = 0; i < array.length; i++ ){
            sum += array[i][index];
        }
        System.out.print("Total is: " + sum );
    }
}
