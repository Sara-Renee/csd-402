//Sara White
//CSD-402
//Assignment 3.2

public class White_Assignment3_2 {

    static void printTriangle(int n) {

        for (int i = 0; i < n; i++) {

            
            for (int j = n - i; j > 1; j--) {

                // fixed-width spacing
                System.out.print("    "); 
            }

            // Print ascending numbers multipled by 2
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", value);
                value *= 2;
            }

            // Print descending numbers divided by 2
            value /= 4;
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", value);
                value /= 2;
            }

            // I couldn't figure out how to get the "@" signs to print in a straight column
            System.out.printf("%40s", "@");

            // Display output
            System.out.println();
           
          
        }
    }

    public static void main(String[] args) {
        // prints up to 64 in 7 rows
        printTriangle(7); 
    }
}


//References

//GeeksforGeeks. (n.d.). Programs for printing pyramid patterns in Java. https://www.geeksforgeeks.org/java/programs-printing-pyramid-patterns-java/

//TheServerSide. (n.d.). Format output with Java printf. https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output