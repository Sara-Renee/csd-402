//Sara White - Assignment 9.2 - CSD-402//

import java.io.File;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class DataFileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("data.file");
 	
        Random rand = new Random();

        //create or append to file
        // FileOutputStream(file, true): true to append
        PrintWriter output = new PrintWriter(new FileOutputStream(file, true));

        //write 10 random integers
        for (int i = 0; i < 10; i++) {
            //setting a range for number generation
            int num = rand.nextInt(100);
            //separated by spaces
            output.print(num + " ");
        }
        output.println(); 

        //close the file
        output.close();

        //reopen the file, read and display its contents
        System.out.println("Contents of data.file:");
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }

        input.close();
    }
}