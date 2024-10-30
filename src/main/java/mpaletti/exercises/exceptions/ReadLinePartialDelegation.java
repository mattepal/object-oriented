package mpaletti.exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;

public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename){
        try(BufferedReader buffer= new BufferedReader(new FileReader(filename))) {
            return buffer.readLine();
        }catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }
}
