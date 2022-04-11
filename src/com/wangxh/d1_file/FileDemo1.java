package com.wangxh.d1_file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //1.创建file对象(指定文件路径获取)
        File f = new File("\u202AC:\\Users\\为了谁\\Desktop\\截图图片\\微信图片_20220406133501.jpg");
        long size = f.length();
        System.out.println(size);


    }
}
