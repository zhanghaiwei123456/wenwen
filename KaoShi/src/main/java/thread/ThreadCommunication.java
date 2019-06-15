package thread;
/**
 * 
 * @����: ���߳�ѭ��10�Σ����Żص����߳�ѭ��100�Σ��ֽ��Żص����߳�ѭ��10�Σ��ٽ��Żص����߳���ѭ��100�Σ����ѭ��50�Σ���д������ ..
 * @����: Wnj .
 * @����ʱ��: 2017��5��15�� .
 * @�汾: 1.0 .
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
     * ���߳�ѭ��10��
     * synchronized����
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
     * ���߳�ѭ��100��
     * synchronized����
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