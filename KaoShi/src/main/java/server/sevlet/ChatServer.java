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
		 * 1.�������˴���ServerSocket���󣬵���accept��������Socket����
		 * 2.�ͻ��˴���Socket����ͨ���˿����ӵ�������
		 * 3.�ͻ��ˡ��������˶�ʹ��Socket�е�getInputStream������getOutputStream����������������������
		 * ��һ���������ݶ�д����
		 * ��InetAddress��������������ַ��
		 * Socket����������̨����֮������ӣ�
		 * ServerSocket�����������Կͻ��˵�����
		 * Socketͨ���������׽��֡���ͨ��ͨ�����׽��֡������緢���������Ӧ���������󡣣�
		 */
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("�ȴ��ͻ�������....");
		Socket s = ss.accept();
		System.out.println("�ͻ����ӳɹ���"+s.getInetAddress());
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
		 * setDaemon��true�����ǽ���ǰ���̱�ɺ�̨���̡�
		 * �����ĳ���̶߳���������(����start����)֮ǰ������setDaemon(true)����,
		 * ����߳̾ͱ���˺�̨�߳�.��java������˵,ֻҪ����һ��ǰ̨�߳�������,
		 * ������̾Ͳ������,���һ��������ֻ�к�̨�߳�����,������̻����.
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

