
/**
 * Program to read in and perform some searching on METAL vertex data.
 *
 * @author Jim Teresco and the Fall 2018 CSIS 210 class at Siena College
 */

/* Note that wildcards are not being used for imports, and only 
 * precisely those packages that are needed are being imported.
 * This is a good programming practice to make sure you do not
 * introduce names and conflicts from over-importing.2
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class VertexSearch {
    
    /**
     * main method to run our search
     * 
     * @param args args[0] is the name of the file to read in
     */
    public static void main(String args[]) {
        
        // we'll start with a check to make sure there's a file name
        // provided on the command line
        if (args.length != 1) {
            // System.err is like System.out, except it's used for error messages
            // rather than normal output.
            System.err.println("Usage: java VertexSearch filename");
            
            // System.exit kills the program, and its parameter indicates an error
            // code. A code of 0 means successful completion, and other numbers 
            // indicate problems caused an unsuccessful exit.  We'll use 1.
            System.exit(1);
        }
        
        // A try-catch block will deal with errors opening and closing our file.
        // We will need to declare any variables we need both inside the block and
        // once we continue below before the block.  Further, if they are initialized
        // only inside the try block, we need to initialize them here to avoid errors
        // from Java about potentially using variables that have not been given an
        // initial value.
        int numVertices = 0, numEdges = 0;
        try {
            Scanner inFile = new Scanner(new File(args[0]));
            
            // the first line of the file is a version number, which for now
            // we can ignore
            inFile.nextLine();
            
            // the second line is two numbers: the number of vertices and the
            // number of edges that follow
            //
            // for now, we only care about vertices, but we'll read and stor 
            // both anyway for later
            numVertices = inFile.nextInt();
            numEdges = inFile.nextInt();
            
            // the next numVertices lines each have a string (a vertex label)
            // followed by two numbers (the latitude and the longitude of the
            // vertex), so a counting loop can work here
            for (int vertexNum = 0; vertexNum < numVertices; vertexNum++) {
                String label = inFile.next();
                double lat = inFile.nextDouble();
                double lng = inFile.nextDouble();
            }
            
            inFile.close();
        }
        catch (IOException e) {
            // if anything bad happened, an exception will be thrown, so we print
            // the error and exit in that case
            System.err.println(e);
            System.exit(1);
        }
        
        System.out.println("Successfully read in " + numVertices + " vertex entries.");
        System.out.println("Ignored " + numEdges + " edge entries.");
    }

}
