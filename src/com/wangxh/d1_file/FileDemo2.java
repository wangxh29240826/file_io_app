package com.wangxh.d1_file;

import java.io.File;

public class FileDemo2 {

    public static void main(String[] args) {
        File f1 = new File("file-io-app\\src\\data.txt");
        //a创建新文件，创建成功返回true，反之，  不需要这个，文件写出去的时候都会自动创建
//        System.out.println(f.createNewFile());
        //b.mkdir创建一级目录
        File f2 = new File("C:/resources/aaa");
        System.out.println(f2.mkdir());

        //c.mkdies创建多级目录
        File f3 = new File("C:/resources/ddd/ccc/bbb");
        System.out.println(f3.mkdirs());

        //d.删除文件或者空文件夹

        System.out.println(f1.delete());

        //这个只能删除空文件夹
        File f5 = new File("D:/resources");
        System.out.println(f5.delete());

    }
}
