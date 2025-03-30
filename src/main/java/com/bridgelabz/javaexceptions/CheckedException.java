package com.bridgelabz.javaexceptions;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("data.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");
            int byteData;
            while((byteData = fis.read())!= -1){
                fos.write(byteData);
                System.out.print((char)byteData);
            }
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }
}


