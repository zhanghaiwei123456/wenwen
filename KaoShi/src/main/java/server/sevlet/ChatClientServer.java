package server.sevlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClientServer {

	public static void main(String[] args) throws UnknownHostException, IOException {
		ChatClientServer client = new ChatClientServer();
		client.open();

	}
	public void open() throws UnknownHostException, IOException {
		Socket s = new Socket("locathost",8000);
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();

		new Writer(out).start();
	}


		public void run() {
			Scanner s = new Scanner(System.in);
			
		}

	}


class Writer extends Thread{
	InputStream in;
     public Writer(OutputStream out) {
		this.in = in;
	}
	public void run() {
		try {
			int b;
			while((b = in.read())!=-1) {
				System.out.write(b);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}