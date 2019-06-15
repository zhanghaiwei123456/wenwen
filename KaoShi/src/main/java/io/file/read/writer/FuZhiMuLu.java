package io.file.read.writer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 将d:\java目录下的所有.java文件复制到d:\jad目录下，
 * 并将原来文件的扩展名从.java改为.jad。
 * @author Administrator
 *
 */
public class FuZhiMuLu {

	public static void main(String[] args) throws Exception {
		File srcDir  = new File("java");
		if(!(srcDir.exists()&&srcDir.isDirectory())){
			throw new Exception("目录不存在");
		}
		//目录下的java
		File[] files = srcDir.listFiles(
				new FilenameFilter(){//名字过滤器

					public boolean accept(File dir, String name) {
						// TODO Auto-generated method stub
						return name.endsWith(".java");
					}//遍历指定目录下面，指定的后缀的文件。
				});
		System.out.println(files.length);//*.java的数目
		File destDir = new File("jad");
		if(!destDir.exists()) destDir.mkdirs();//创建文件夹jad,   mkdirs()可以建立多级文件夹， mkdir()只会建立一级的文件夹
		for(File f:files){
			FileInputStream fis = new FileInputStream(f);//输入字节流
			//*.java改为*.jad-----------正则表达式中.需要'\.'，而\需要写为\\。$是正则表达式结束符
			String destFileName = f.getName().replaceAll("\\.java$",".jad");
			//输出字节流
			FileOutputStream fos = new FileOutputStream(new File(destDir,destFileName));
			copy(fis, fos);
			fis.close();
			fos.close();

		}
	}
		//字节流拷贝
		private static void copy(InputStream ips,OutputStream ops) throws IOException{
			int len = 0;
			byte[] buf = new byte[1024];
			while((len = ips.read(buf))!=-1){
				ops.write(buf,0,len);
			
		}

	}

}
