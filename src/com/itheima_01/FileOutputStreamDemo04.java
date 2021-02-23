package com.itheima_01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Develop\\myByteStream\\fos.txt");
        fos.write("Hello".getBytes());

    } catch(IOException e) {
    e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
