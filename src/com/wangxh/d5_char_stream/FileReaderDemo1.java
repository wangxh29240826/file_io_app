package com.wangxh.d5_char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：每次读取一个字符
        //1.创建一个字符输入流管道与源文件
        Reader fr = new FileReader("src/data.04.txt");

        //2.读取一个字符返回，没有可读的字符了返回-1
//        int code = fr.read();
//        System.out.println((char)code);
//
//        int code1 = fr.read();
//        System.out.println((char)code1);

        //使用循环读取字符
        int code;
        while ((code = fr.read()) != -1){
            System.out.println((char)code);
        }

    }
}
