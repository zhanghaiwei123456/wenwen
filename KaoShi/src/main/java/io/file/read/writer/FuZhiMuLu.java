package io.file.read.writer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ��d:\javaĿ¼�µ�����.java�ļ����Ƶ�d:\jadĿ¼�£�
 * ����ԭ���ļ�����չ����.java��Ϊ.jad��
 * @author Administrator
 *
 */
public class FuZhiMuLu {

	public static void main(String[] args) throws Exception {
		File srcDir  = new File("java");
		if(!(srcDir.exists()&&srcDir.isDirectory())){
			throw new Exception("Ŀ¼������");
		}
		//Ŀ¼�µ�java
		File[] files = srcDir.listFiles(
				new FilenameFilter(){//���ֹ�����

					public boolean accept(File dir, String name) {
						// TODO Auto-generated method stub
						return name.endsWith(".java");
					}//����ָ��Ŀ¼���棬ָ���ĺ�׺���ļ���
				});
		System.out.println(files.length);//*.java����Ŀ
		File destDir = new File("jad");
		if(!destDir.exists()) destDir.mkdirs();//�����ļ���jad,   mkdirs()���Խ����༶�ļ��У� mkdir()ֻ�Ὠ��һ�����ļ���
		for(File f:files){
			FileInputStream fis = new FileInputStream(f);//�����ֽ���
			//*.java��Ϊ*.jad-----------������ʽ��.��Ҫ'\.'����\��ҪдΪ\\��$��������ʽ������
			String destFileName = f.getName().replaceAll("\\.java$",".jad");
			//����ֽ���
			FileOutputStream fos = new FileOutputStream(new File(destDir,destFileName));
			copy(fis, fos);
			fis.close();
			fos.close();

		}
	}
		//�ֽ�������
		private static void copy(InputStream ips,OutputStream ops) throws IOException{
			int len = 0;
			byte[] buf = new byte[1024];
			while((len = ips.read(buf))!=-1){
				ops.write(buf,0,len);
			
		}

	}

}
