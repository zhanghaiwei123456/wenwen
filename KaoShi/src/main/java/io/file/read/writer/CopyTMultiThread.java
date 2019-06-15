package io.file.read.writer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将文件夹a(包括其下所有子文件夹和文件)复制到文件夹b下：使用10个
 * 线程同时进行，每个线程独立处理一个文件
 * @author Administrator
 *
 */
public class CopyTMultiThread {
	MyThread[] threads = new MyThread[10];
	public int n = 0;
	public CopyTMultiThread() {
		for(int i=0;i<threads.length;i++) {
			threads[i] = new MyThread();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		new CopyTMultiThread().copyDirectiory(new File("d:\\a"),new File("d:\\b"));

	}
	public void copyDirectiory(File sourceDir,File targetDir) throws InterruptedException {
		if(!targetDir.exists()) {
			targetDir.mkdirs();//mkdirs()可以建立多级文件夹， mkdir()只会建立一级的文件夹， 如下：
		}
		File[] file = sourceDir.listFiles();
		for(int i=0;i<file.length;i++) {
			if(file[i].isFile()) {
				File targetFile = new File(targetDir.getAbsolutePath()+File.separator+file[i].getName());//返回抽象路径名的绝对路径名字符串。
				MyThread t = threads[n++%10];
				t.set(file[i], targetFile);
				t.start();
				t.join();
				threads[n % 10] = new MyThread();
			}
			if(file[i].isDirectory()) {
				String dir2 = targetDir.getAbsolutePath()+File.separator+file[i].getName();
				copyDirectiory(file[i],new File(dir2));
			}
			
		}
		
	}

}
class MyThread extends Thread{
	private File src;
	private File desc;
	public MyThread() {
	}
	public void set(File src,File desc) {
		this.src = src;
		this.desc = desc;
	} 
	public void run() {
		try {
			copyFile(src,desc);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void copyFile(File src,File desc) throws IOException {
		if(!desc.exists()) {
			desc.createNewFile();
		}
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(desc);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			int b = -1;
			while((b=bis.read())!=-1) {
				bos.write(b);
			}
		}finally {
			if(bis != null) {
				bis.close();
			}
			if(bos != null) {
				bos.flush();//flush() 是清空，而不是刷新啊。
				bos.close();
			}
		}
	}
}