package com.wangxh.d1_file;

import java.io.File;
import java.util.Arrays;

public class FileDemo3 {
    public static void main(String[] args) {
        //1.定位一个目录
        File f1 = new File("C:/resources");
        String[] names = f1.list();
        for (String name: names
             ) {
            System.out.println(name);
        }

        //2.一级文件对象
        //获取当前目录下所有的“一级文件对象"到一个文件对象那个数组中去返回
        File[] files = f1.listFiles();
        for (File f: files
             ) {
            System.out.println(f.getAbsolutePath());
        }

        //注意事项
        File dir = new File("C:sss");
        File[] files1 = dir.listFiles();
        System.out.println(Arrays.toString(files1));
    }



}
