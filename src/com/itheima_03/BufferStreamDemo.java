package com.itheima_03;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args)throws IOException {
//        FileOutputStream fos = new FileOutputStream("C:\\Develop\\myByte\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        /*BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Develop\\myByteStream\\bos.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());*/

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Develop\\myByteStream\\bos.txt"));
        /*int by;
        while ((by=bis.read())!=-1){
            System.out.print((char)by);
        }*/

        byte[] bys = new byte[1024];
        int len;
        //while ((len=bys.)
        //test


        bis.close();
    }
}
