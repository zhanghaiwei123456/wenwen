package server.sevlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public static void main(String[] args) throws IOException {
		ChatServer server = new ChatServer();
		server.start();
	}
	public void start() throws IOException {
		/*
		 * 1.服务器端创建ServerSocket对象，调用accept方法返回Socket对象
		 * 2.客户端创建Socket对象，通过端口连接到服务器
		 * 3.客户端、服务器端都使用Socket中的getInputStream方法和getOutputStream方法获得输入流和输出流，
		 * 进一步进行数据读写操作
		 * （InetAddress用来描述主机地址；
		 * Socket用来创建两台主机之间的连接；
		 * ServerSocket用来侦听来自客户端的请求；
		 * Socket通常称作“套接字”，通常通过“套接字”向网络发出请求或者应答网络请求。）
		 */
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("等待客户的连接....");
		Socket s = ss.accept();
		System.out.println("客户连接成功："+s.getInetAddress());
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		Reader r = new Reader(out);
		r.start();

	
	}

}
class Reader extends Thread{
	OutputStream out;

	public Reader(OutputStream out) {
		this.out = out;
		/*
		 * setDaemon（true）就是将当前进程变成后台进程。
		 * 如果对某个线程对象在启动(调用start方法)之前调用了setDaemon(true)方法,
		 * 这个线程就变成了后台线程.对java程序来说,只要还有一个前台线程在运行,
		 * 这个进程就不会结束,如果一个进程中只有后台线程运行,这个进程会结束.
		 */
		setDaemon(true);
	}
	public void run() {
		Scanner s = new Scanner(System.in);
		try {
			while(true) {
				String str = s.nextLine();
				out.write(str.getBytes());
				out.write('\n');
				out.flush();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}

