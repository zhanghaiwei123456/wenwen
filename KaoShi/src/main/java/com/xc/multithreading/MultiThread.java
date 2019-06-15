package com.xc.multithreading;
/**
 * 编写一个类，共4个线程，2个每次对j+1,另两个每次对j-1
 * 继承Runnable接口  和 start  
 * 1、线程同步--synchronized   
 * 2、线程之间如何共享同一个j变量--内部类   
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
