package com.lyq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
	public static void main(String[] args) 
	{
		//定义端口号
		int iPort = 89;
		try {
			/*
			 * ServerSocket是jdk提供的用于网络通讯编程的核心类。
			 * 是服务器端用于
			 */
			ServerSocket serverSocket = new ServerSocket(iPort);
			System.out.println("开始监听端口："+iPort);
			/*
			 * 无限循环用于每时每刻都在监听端口
			 */
			while (true) 
			{
				/*
				 * A socket is an endpoint for communication between two machines.
				 * 一个socket就是两台电脑通讯的终端
				 */
				Socket socket = serverSocket.accept();
				System.out.println("连接上了");
				InputStream inputStream = socket.getInputStream();
				
				InputStreamReader isr = new InputStreamReader(inputStream);
				
				BufferedReader br = new BufferedReader(isr);
				String line = br.readLine();
				while (true) {
					
					System.out.println("receive:"+line);
					line = br.readLine(); 
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
