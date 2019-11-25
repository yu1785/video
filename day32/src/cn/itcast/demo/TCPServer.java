package cn.itcast.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    实现TCP服务器端
    构造方法：ServerSocket（int port） 绑定端口号
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        //接收客户端数据
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data,0,len));
        //向客户端回数据
        OutputStream out = socket.getOutputStream();
        out.write("ok!".getBytes());

        socket.close();
        server.close();
    }
}
