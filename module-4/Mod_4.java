//Sara White - CSD-402 - Assignment 4.2

public class Mod_4 {

    // Short array
    public static short average(short[] array) {
	// Create and initialize variable for sum of array elements
        int total = 0;

	// Calculate sum (total) of array elements
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

	// Calculate average of sum (total)
        return (short) (total / array.length);
    }

	// Method for other data types will follow same structure

    // Int array
    public static int average(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    // Long array
    public static long average(long[] array) {
        long total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    // Double array
    public static double average(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }



    public static void main(String[] args) {


	// Assign value to elements
        short[] shortArray = {14, 21, 39};
        int[] intArray = {6, 12, 18, 37};
        long[] longArray = {1341L, 2987L, 1498L, 3001L, 2701L};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};


        // Display short array elements and average
        System.out.println("--------------------------------------------------------------");
        System.out.println("The short array contains values:");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i] + "\n");
        }

        System.out.println("\nThe average of these values is " + average(shortArray) + "\n");

        

        // Display int array elements and average
        System.out.println("--------------------------------------------------------------");
        System.out.println("The int array contains values:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "\n");
        }
        System.out.println("\nThe average of these values is " + average(intArray) + "\n");


        // Display long array elements and average
        System.out.println("--------------------------------------------------------------");
        System.out.println("The long array contains values:");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + "\n");
        }
        System.out.println("\nThe average of these values is " + average(longArray) + "\n");


        // Display double array elements and average
        System.out.println("--------------------------------------------------------------");
        System.out.println("The double array contains values:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + "\n");
        }
        System.out.println("\nThe average of these values is " + average(doubleArray) + "\n");
        System.out.println("--------------------------------------------------------------");
    }
}


// References
// Liang, Y. D. (2025). Introduction to Java Programming and Data Structures. Pearson.