package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import static java.lang.System.in;

public class LowerCaseInputStream extends FileInputStream {
    public LowerCaseInputStream(InputStream in) throws FileNotFoundException {
        super(in.toString());
    }

    public int read() throws IOException{
        int c = in.read();
        return (c ==-1 ? c: Character.toLowerCase((char)c));
    }
    public int read(byte[] b, int offset, int len) throws IOException{
        int result = in.read(b, offset, len);

        for(int i= offset; i< offset + result; i++){
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
