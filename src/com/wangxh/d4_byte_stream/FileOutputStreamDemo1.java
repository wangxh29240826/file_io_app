package com.wangxh.d4_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输出管道与目标文件接通
        OutputStream os = new FileOutputStream("src/out03.txt");

        //2.写数据出去
        os.write('a');
        os.write('b');
        os.write(98);
//        os.write('徐');

        //b.public void write(byte[] buffer):写一个字节数组出去
        byte[] buffer = {'a',97,98,99};
        os.write(buffer);

        byte[] buffer2 = "我是中国人".getBytes();
        os.write(buffer2);

        //c.public void write(byte[] buffer,int pos,int len):写一个字节数组的一部分出去






//        os.flush();//写数据必须，刷新数据 然后继续使用流
        os.close();//释放资源，包含了刷新的！关闭后流不可以使用了



    }
}
