package com.itheima_02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Develop\\myByteStream\\fos.txt");

       /* byte[] bys = new byte[5];

        int len = fis.read(bys);
        System.out.println(len);

        System.out.println(new String(bys,0,len));

        len = fis.read(bys);
        System.out.println(len);

        System.out.println(new String(bys,0,len));

        len = fis.read(bys);
        System.out.println(len);

        System.out.println(new String(bys,0,len));*/
        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }

        fis.close();
    }
}
