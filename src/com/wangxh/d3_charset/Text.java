package com.wangxh.d3_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Text {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码：把文字转换成字节（使用指定的编码）
        String name = "abc中国我爱你";
//        byte[] bytes = name.getBytes("GBK");
        byte[] bytes = name.getBytes();
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));


        //2.解码：把字节转换成对应中文形式
        String rs = new String(bytes);
        System.out.println(rs);
    }

}
