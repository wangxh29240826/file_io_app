package com.wangxh.d5_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) throws Exception {

        Reader fr = new FileReader("src/data.04.txt");

        char[] buffer = new char[1024];
        int len;
        while ((len = fr.read(buffer)) != -1){
            String rs = new String(buffer,0,len);
            System.out.println(rs);
        }

    }
}
