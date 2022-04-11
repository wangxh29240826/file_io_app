package com.wangxh.d4_byte_stream;

import java.io.*;

public class TryCatchResouceDemo2 {
    public static void main(String[] args) {
        try (
            //1.创建一个字节输入如流管道与原视频接通
            InputStream is = new FileInputStream("C:\\Users\\为了谁\\Desktop\\截图图片\\微信图片_20220406133501.jpg");
            //2.创建一个字节流管道与目标文件接通
            OutputStream os = new FileOutputStream("C:\\Users\\为了谁\\Desktop\\截图图片\\微信图片_20220406133502.jpg");

            //这里只能放资源
            MyConnection connection = new MyConnection(); //自动调用资源释放

            ) {
            //定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!= -1){
                os.write(buffer,0,len);
            }
            System.out.println("复制成功了!!");



        } catch (Exception e) {
            e.printStackTrace();
        }
        }

        static class MyConnection implements AutoCloseable{

            @Override
            public void close() throws IOException {
                System.out.println("定义资源被成功释放");
            }
        }
    }
