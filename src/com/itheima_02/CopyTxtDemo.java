package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Develop\\itcast\\新建.txt");

        FileOutputStream fos =new FileOutputStream("C:\\Develop\\myByteStream\\新建.txt");

        int by;
        while ((by= fis.read())!=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
