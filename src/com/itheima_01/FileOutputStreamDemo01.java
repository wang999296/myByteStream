package com.itheima_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Develop\\myByteStream\\fos.txt");

        fos.write(97);

        fos.close();
    }
}
