package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream original;

    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        original.flush();
    }

    public AmigoOutputStream(FileOutputStream original) throws FileNotFoundException {
        super(fileName);
        this.original = original;
    }

    @Override
    public void close() throws IOException {
        flush();
        String tmp = "JavaRush © All rights reserved.";
        write(tmp.getBytes());
        original.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
