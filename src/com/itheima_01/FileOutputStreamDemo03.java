package com.itheima_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Develop\\myByteStream\\fos.txt",true);

        for (int i =0; i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
     