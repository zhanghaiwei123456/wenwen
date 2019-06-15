package com.xc.multithreading;
/**
 * ��дһ���࣬��4���̣߳�2��ÿ�ζ�j+1,������ÿ�ζ�j-1
 * �̳�Runnable�ӿ�  �� start  
 * 1���߳�ͬ��--synchronized   
 * 2���߳�֮����ι���ͬһ��j����--�ڲ���   
 * @author Administrator
 *
 */
public class MultiThread {

	public static void main(String[] args) {
		MultiThread many = new MultiThread();
	        Inc inc = many.new Inc();
	        Dec dec = many.new Dec();
	        for (int i = 0; i < 2; i++) {
	            Thread t = new Thread(inc);
	            t.start();
	            t = new Thread(dec);
	            t.start();
	        }
	    }
        int j=0,i=0;
        private synchronized void inc() {
            j++;
            System.out.println(Thread.currentThread().getName() + "inc" + j);
        }

        private synchronized void dec() {
            j--;
            System.out.println(Thread.currentThread().getName() + "dec" + j);
        }

	    class Inc implements Runnable {

	    
	        public void run() {
	            // TODO Auto-generated method stub
	            for (int i = 0; i < 2; i++) {
	                inc();
	            }
	        }

	    }

	    class Dec implements Runnable {


	        public void run() {
	            // TODO Auto-generated method stub
	            for (int i = 0; i < 2; i++) {
	                dec();
	            }
	        }

	    }
	
	

}
