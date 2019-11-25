package cn.itcast.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        /*
        //创建数据包对象，封装要发送的数据
        byte[] data = "hello UDP".getBytes();
        //创建InetAddress对象，封装自己的IP地址
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(data,data.length,inet,6000);
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //发送数据包
        ds.send(dp);
        //关闭资源
        ds.close();
        */

       /*
            手动输入发送数据
        */
        Scanner sc = new Scanner(System.in);
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //创建InetAddress对象，封装自己的IP地址
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        while(true){
            String str = sc.nextLine();
            //创建数据包对象，封装要发送的数据
            byte[] data = str.getBytes();
            DatagramPacket dp = new DatagramPacket(data,data.length,inet,6000);
            ds.send(dp);
        }
    }
}
