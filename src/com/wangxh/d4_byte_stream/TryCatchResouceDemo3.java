package com.wangxh.d4_byte_stream;

import java.io.*;

//JDk9释放资源的方式：了解一下就行
public class TryCatchResouceDemo3 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\Users\\为了谁\\Desktop\\截图图片\\微信图片_20220406133501.jpg");

        //2.创建一个字节流管道与目标文件接通
        OutputStream os = new FileOutputStream("C:\\Users\\为了谁\\Desktop\\截图图片\\微信图片_20220406133502.jpg");
        try (is; os) {
            //定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制成功了!!");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
