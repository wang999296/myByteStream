package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Develop\\itcast\\11111.jpg");

        FileOutputStream fos = new FileOutputStream("C:\\Develop\\myByteStream\\11111.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fis.close();
        fos.close();
    }
}
