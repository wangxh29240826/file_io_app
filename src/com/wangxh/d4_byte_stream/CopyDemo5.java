package com.wangxh.d4_byte_stream;

import java.io.*;

public class CopyDemo5 {
    public static void main(String[] args) throws IOException {
        //1.创建一个字节输入如流管道与原视频接通
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("C:\\Users\\为了谁\\Desktop\\截图图片\\微信图片_20220406133501.jpg");

            //2.创建一个字节流管道与目标文件接通
            os = new FileOutputStream("C:\\Users\\为了谁\\Desktop\\截图图片\\微信图片_20220406133502.jpg");

            //定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!= -1){
                os.write(buffer,0,len);
            }
            System.out.println("复制成功了!!");



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //4.关闭流
            System.out.println("我一定会执行!!");

            is.close();
            os.close();
            //这里优雅改进
        }
    }
}
