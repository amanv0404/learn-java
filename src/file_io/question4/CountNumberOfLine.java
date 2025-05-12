
// Write a program to count the number of lines in a text file called
// data.txt.

package file_io.question4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountNumberOfLine {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("files/data.txt"))){

            int lines = 0;

            while(reader.readLine() !=null){
                lines++;
            }
            System.out.println("Total numbers of line: "+lines);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+e.getMessage());
        } catch (IOException ex){
            System.out.println("An Exception occurred: "+ ex.getMessage());
        }
    }
}
