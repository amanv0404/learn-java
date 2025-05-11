//1️ Multi-level exception propagation
//Write a program with three methods: readData(), processData(), and
//main().
//         readData() reads from a file and throws IOException.
//         processData() calls readData() and catches IOException,
//then throws a DataProcessingException (custom).
//         main() catches DataProcessingException and logs it.
//Simulate this flow and explain how exceptions travel across layers.



package exception.question1;

import java.io.IOException;

public class ExceptionFlow {

    public static void readData() throws IOException {
        throw new IOException("Failed to read file: data.txt");
    }

    public static void processData() throws DataProcessingException {
        try {
            readData();
        } catch (IOException e) {
            throw new DataProcessingException("Error processing data", e);
        }
    }

    public static void main(String[] args) {
        try {
            processData();
        } catch (DataProcessingException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
