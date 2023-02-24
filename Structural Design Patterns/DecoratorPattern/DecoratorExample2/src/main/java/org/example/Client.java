package org.example;

import java.io.*;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {

        int c;

        StringBuffer stringBuffer = new StringBuffer("Huseyin Basturk fdskfdksfFSDFSDFS");
        byte[] bytes = stringBuffer.toString().getBytes();
        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) > 0){
                System.out.println((char)c);
            }

            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}