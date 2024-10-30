package mpaletti.exercises.exceptions;

import java.io.*;

public class ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException {
        try (BufferedReader buffer= new BufferedReader(new FileReader(filename))){
            return buffer.readLine();
        }
    }
}
