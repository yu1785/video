package cn.itcast.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
    public static void main(String[] args) throws IOException {

        //创建数据包传输对象 绑定端口号
        DatagramSocket ds = new DatagramSocket(6000);
        //创建字节数组 存放接受数据
        byte[] data = new byte[1024];
        while (true){
            DatagramPacket dp = new DatagramPacket(data,data.length);
            ds.receive(dp);
            //接收的字节个数
            int length = dp.getLength();
            //获取发送端IP地址
            String ip = dp.getAddress().getHostAddress();
            //获取发送端口号
            int port = dp.getPort();

            System.out.println(new String(data,0,length)+"..."+ip+" : "+port);
        }
//        ds.close();

    }
}
