import java.util.Scanner;

public class Main {
    //Scanner to input array values
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Sets the value for the array size
        int[] myIntegers = getIntegers(5);

        //Prints selected integer values
        for (int i = 0; i<myIntegers.length;i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers)) ;
    }

    //Method receives integers for array
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");

        //Array length determined
        int[] values = new int[number];

        //Scanner receives quantity of numbers entered equal numbers value
        for (int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;

    }
    //Calculates average of inputted array
    public static double getAverage(int[] array){
        //Stores the value for the sum
        int sum = 0;
        //Loops inputted array
        for (int i = 0; i<array.length; i++){
            //Adds each value in array to the next for total sum
            sum += array[i];

        }
        //Divides sum by length of array, returns average
        return (double) sum / (double) array.length;


    }


}