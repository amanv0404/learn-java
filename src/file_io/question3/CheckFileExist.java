
// Write a program that checks if a file named report.pdf exists in
// the current directory and prints its size (in bytes).

package file_io.question3;


import java.io.File;

public class CheckFileExist {
    public static void main(String[] args) {

        try{
            File file = new File("files/report.pdf");

            if(file.exists() && file.isFile()){
                System.out.println("File found: "+file.getName());
                System.out.println("Size: "+file.length());
            }else{
                System.out.println("File not found or is not valid file");
            }
        }catch (Exception e){
            System.out.println("Exception occurred: "+e.getMessage());
        }


    }
}
