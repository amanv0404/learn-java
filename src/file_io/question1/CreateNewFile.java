
//Write a program to create a new text file named notes.txt and
//write the line:
//        “This is my first file in Java.”

package file_io.question1;
import java.io.*;

public class CreateNewFile {
    public static void main(String[] args) {

       try(FileWriter writer = new FileWriter("files/notes.txt")){
           writer.write("This is my first file in Java.");
           System.out.println("File created successfully");
       }catch (IOException e){
           System.out.println("Expection occured: "+e);
       }

    }
}
