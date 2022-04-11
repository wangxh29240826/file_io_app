package com.wangxh.d4_byte_stream;

import java.io.*;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src/data.txt");

        //2.读取一个字节返回(每次只读取一滴水)
        int b1 = is.read();
        System.out.println((char)b1);


        int b2 = is.read();
        System.out.println((char)b2);


        int b3 = is.read();
        System.out.println((char)b3);
        int b4 = is.read();
        System.out.println((char)b4);






    }
}
