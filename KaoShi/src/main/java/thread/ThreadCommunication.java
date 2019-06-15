package thread;
/**
 * 
 * @描述: 子线程循环10次，接着回到主线程循环100次，又接着回到子线程循环10次，再接着回到主线程又循环100次，如次循环50次，请写出程序 ..
 * @作者: Wnj .
 * @创建时间: 2017年5月15日 .
 * @版本: 1.0 .
 */
public class ThreadCommunication {

	public static void main(String[] args) {
		final Business business = new Business();
		new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=50;i++) {
						business.sub(i);
				}
			}
			
		}).start();;
		for(int i=1;i<=50;i++) {
			business.main(i);
		}

	}

}
class Business{
	private  boolean bShouldSub = true;
	/**
     * 子线程循环10次
     * synchronized互斥
     * @param i
     */
	public synchronized void sub(int i) {
		while(!bShouldSub) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int j=1;j<10;j++) {
			System.out.println("sub sequence is :" + j + " main loop is :"+ i);
		}
		bShouldSub = false;
		this.notify();
	}
	/**
     * 主线程循环100次
     * synchronized互斥
     * @param i
     */
	public synchronized void main(int i) {
		while(bShouldSub) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int j=1;j<100;j++) {
			System.out.println("main sequence is :" + j + "main loop is :"+ i);
		}
		bShouldSub = true;
		this.notify();
	}
}