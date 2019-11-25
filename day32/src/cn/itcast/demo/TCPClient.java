package cn.itcast.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;

/*
    实现TCp客户端，链接到服务器
    构造方法：Socket（String host，int port） 传递服务器IP和端口号
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        //向服务器端写数据
        OutputStream out = socket.getOutputStream();
        out.write("server".getBytes());
        //接收服务器端数据
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data,0,len));

        socket.close();
    }
}
