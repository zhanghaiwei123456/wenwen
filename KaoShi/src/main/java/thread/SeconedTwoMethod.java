package thread;
/**
 * �ö��̵߳����ַ���ʵ�֣�����ַ�����hello",
 * Ҫ��ÿ���һ�����һ����ĸ
 * @author Administrator
 *
 */
public class SeconedTwoMethod {

	public static void main(String[] args) {
		TestThread1 tt1 = new TestThread1();
		tt1.start();
		Thread tt2 = new Thread(new TestThread2());
		tt2.start();

	}

}
class TestThread1 extends Thread{
	public void run() {
		char[] str = {'H','e','l','l','o'};
		try {
			for(int i=0;i<str.length;i++) {
				System.out.print(str[i]);
				sleep(1000);
			}
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class TestThread2 implements Runnable{
	public void run() {
		char[] str = {'H','e','l','l','o'};
		try {
			for(int i=0;i<str.length;i++) {
				System.out.print(str[i]);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}