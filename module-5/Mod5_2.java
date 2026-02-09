public class Mod5_2 {

    public static void main(String[] args) {

        // Define values for double array
        double[][] doubleArray = {
            {1.2, 3.4, 5.6},
            {0.5, 9.8, 2.1}
        };

        int[] largestDoubleLoc = locateLargest(doubleArray);
        int[] smallestDoubleLoc = locateSmallest(doubleArray);

        System.out.println("Double array values: ");
        printDoubleArray(doubleArray);

        System.out.println("The largest value in double array is located at row "
                + largestDoubleLoc[0] + ", column " + largestDoubleLoc[1]);

        System.out.println("The smallest value in double array is located at row "
                + smallestDoubleLoc[0] + ", column " + smallestDoubleLoc[1]);

        // Define values for int array
        int[][] intArray = {
            {9, 4, 2},
            {11, 39, 1}
        };

        // Store the results of the methods in variables
        int[] largestIntLoc = locateLargest(intArray);
        int[] smallestIntLoc = locateSmallest(intArray);

        // Display array values
        System.out.println("\nInteger array values:");
        printIntArray(intArray);

        // Display method results
        System.out.println("The largest value in int array is at row "
                + largestIntLoc[0] + ", column " + largestIntLoc[1]);

        System.out.println("The smallest value in int array is at row "
                + smallestIntLoc[0] + ", column " + smallestIntLoc[1]);
    }

    // Methods

    public static int[] locateLargest(double[][] arrayParam) {
        // Initialize element values so iteration has a starting point
        double largestValue = arrayParam[0][0];
        int largestRow = 0;
        int largestCol = 0;

        // Iterate over each row and column
        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > largestValue) {
                    largestValue = arrayParam[r][c];
                    largestRow = r;
                    largestCol = c;
                }
            }
        }

        // Return results of method for largest element
        return new int[] { largestRow, largestCol };
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        // Initialize element values so iteration has a starting point
        double smallestValue = arrayParam[0][0];
        int smallestRow = 0;
        int smallestCol = 0;

        // Iterate over each row and column
        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < smallestValue) {
                    smallestValue = arrayParam[r][c];
                    smallestRow = r;
                    smallestCol = c;
                }
            }
        }

        // Return results of method for smallest element
        return new int[] { smallestRow, smallestCol };
    }

    public static int[] locateLargest(int[][] arrayParam) {
       
        int largestValue = arrayParam[0][0];
        int largestRow = 0;
        int largestCol = 0;

       
        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > largestValue) {
                    largestValue = arrayParam[r][c];
                    largestRow = r;
                    largestCol = c;
                }
            }
        }

     
        return new int[] { largestRow, largestCol };
    }

    public static int[] locateSmallest(int[][] arrayParam) {
      
        int smallestValue = arrayParam[0][0];
        int smallestRow = 0;
        int smallestCol = 0;

      
        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < smallestValue) {
                    smallestValue = arrayParam[r][c];
                    smallestRow = r;
                    smallestCol = c;
                }
            }
        }

     
        return new int[] { smallestRow, smallestCol };
    }

