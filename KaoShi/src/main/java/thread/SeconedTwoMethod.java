package thread;
/**
 * 用多线程的两种方法实现：输出字符串“hello",
 * 要求每间隔一秒输出一个字母
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