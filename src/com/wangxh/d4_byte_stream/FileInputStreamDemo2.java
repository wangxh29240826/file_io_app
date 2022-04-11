package com.wangxh.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src/data02.txt");


        //2.定义一个字节数组，用于读取字节数组
        byte[] buffer = new byte[3];
        int len = is.read(buffer);
        System.out.println("读取了几个字节:"+len);
        String rs = new String(buffer);
        System.out.println(rs);

        int len1 = is.read(buffer);
        System.out.println("读取了几个字节:"+len1);
        String rs1 = new String(buffer);
        System.out.println(rs1);

        int len2 = is.read(buffer);
        System.out.println("读取了几个字节:"+len2);
        String rs2 = new String(buffer);
        System.out.println(rs2);
    }
}
