package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test
{
public static void main(String[] args){
try {
    try (BufferedReader aaa = new BufferedReader(new FileReader("onegin.txt"))) {
        String bbb = aaa.readLine();
        
        System.out.println("The first line is:");
        System.out.println(bbb);
        
        bbb = aaa.readLine();
        
        System.out.println("The second line is:");
        System.out.println(bbb);
    }
} catch(FileNotFoundException e) {
System.out.println("File onegin.txt was not found");
System.out.println("or could not be opened.");
} catch( IOException e) {
System.out.println("Error reading from onegin.txt.");
}
}
}