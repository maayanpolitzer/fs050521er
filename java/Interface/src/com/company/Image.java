package com.company;

public class Image extends File implements Printable {

    private byte[] bytes;

    public byte[] getBytes() {
        return bytes;
    }

    @Override
    public void print() {

    }
}
