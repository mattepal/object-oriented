package mpaletti.exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename){
       try(BufferedReader buffer= new BufferedReader(new FileReader(filename));) {
           return buffer.readLine();
       } catch (IOException e) {
           return null;
       }
    }
}
