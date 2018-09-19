import java.io.*; // for file exceptions
import java.util.Scanner; //need for the scanner


public class a5 {

public static void main(String [] args) throws IOException {

    //ask user for the file names
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter the file name to be read: ");
    String filename = keyboard.nextLine();
    //String filename = "InputFile.txt";

    //for the output file
    Scanner keyboard2 = new Scanner(System.in);
    System.out.print("Please enter the output file name: ");
    String output = keyboard2.nextLine();
    PrintWriter outputFile = new PrintWriter(output);

    // open the file
    //File file = new File("C:\\Users\\bayqu\\Desktop\\CS1336\\a5\\InputFile.txt");
    File file = new File(filename);
    Scanner inputFile = new Scanner(file);

    // read line by line from the file

    while (inputFile.hasNext()) {
        String line = inputFile.nextLine();
        outputFile.println(line.toUpperCase());
      //  System.out.println(line.toUpperCase());
    }
    // close the file now
    inputFile.close();
    outputFile.close();
    System.out.println("Data written to the file and the files are closed.");
}
}
