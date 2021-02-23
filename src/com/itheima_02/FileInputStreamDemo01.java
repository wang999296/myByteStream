package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("C:\\Develop\\myByteStream\\fos.txt");

        //调用字节输入流对象的读数据方法
        //int read():从该输入流读取一个字节的数据

//        //第一次读取数据
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        //第二次读取数据
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
/*

        int by = fis.read();
        while (by != -1) {
            System.out.print((char) by);
            by = fis.read();
        }
*/

        //优化上边的程序
        int by;
        while ((by=fis.read())!=-1){
            System.out.print((char)by);
        }

        //释放资源
        fis.close();
    }
}
