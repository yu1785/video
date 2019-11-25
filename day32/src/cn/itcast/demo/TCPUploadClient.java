package cn.itcast.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    实现TCP图片上传客户端
 */
public class TCPUploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8000);
        //获取字节输出流，图片写到服务器
        OutputStream out = socket.getOutputStream();
        //创建字节输入流
        FileInputStream fis = new FileInputStream("F:\\壁纸\\1.jpg");
        //开始读写字节数组
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            out.write(bytes,0,len);
        }
        //给服务器写终止序列
        socket.shutdownOutput();
        //获取字节输入流
        InputStream in = socket.getInputStream();
        len = in.read(bytes);
        System.out.println(new String(bytes,0,len));

        fis.close();
        socket.close();
    }
}
