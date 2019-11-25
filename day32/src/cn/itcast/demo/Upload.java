package cn.itcast.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Upload implements Runnable{

    private Socket socket;

    public Upload(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try{
            //获取输入流
            InputStream in = socket.getInputStream();
            //将目标文件封装到FIle对象
            File upload = new File("F:\\upload");
            if (!upload.exists())
                upload.mkdirs();

            //防止文件重名被覆盖，重新定义文件名字
            //命名规则： 域名+毫秒值+六位随机数
            String filename = "itcast"+System.currentTimeMillis()+
                    new Random().nextInt(999999)+".jpg";
            //创建字节输出流
            FileOutputStream fos = new FileOutputStream(upload+File.separator+filename);
            //读写字节数组
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = in.read(bytes)) != -1)
                fos.write(bytes,0,len);

            //通过客户端连接对象获取字节输出流
            //将上传成功写回客户端
            socket.getOutputStream().write("upload successful".getBytes());

            fos.close();
            socket.close();
        }catch (IOException ex){

        }
    }
}
