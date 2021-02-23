package com.itheima_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Develop\\myByteStream\\java,txt");
        byte[] bys = "abcde".getBytes();
//        fos.write(bys);
        fos.write(bys,1,3);
        fos.close();
    }
}
