package com.lyq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {


		String host = "127.0.0.1";
		int port = 89;
		try {
			Socket socket = new Socket(host, port);
			OutputStream outStream = socket.getOutputStream();
			//OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream);
			PrintWriter pWriter = new PrintWriter(outStream);
			
			String message = "翻译我喜欢你";
			System.out.println("client:"+message);
			pWriter.println(message);
			//outStreamWriter.write(message);
			//outStreamWriter.flush();
			
			InputStream inputStream = System.in;
			
			InputStreamReader isr = new InputStreamReader(inputStream);
			
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (true) {
				
				System.out.println("send:"+line);
				pWriter.println(line);
				pWriter.flush();
				
				//outStreamWriter.write(line);
				//outStreamWriter.flush();
				line = br.readLine();
			}
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
