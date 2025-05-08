
// Write a program to read and print the contents of a file named

package file_io.question2;

import java.io.*;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        // create the file input.txt
        // write some content

        try(FileWriter writer = new FileWriter("files/input.txt")){
            writer.write("Hello World!");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        // read content from file
        try(FileReader reader = new FileReader("files/input.txt")){

            // read file char until it gives -1;

            int read;

            while((read = reader.read()) != -1){
                System.out.print((char)read);
            }

        } catch (FileNotFoundException ex){
            System.out.println("File not found "+ ex.getMessage());

        }catch (IOException e) {
            System.out.println("Some error occured "+e.getMessage());
        }
    }
}
