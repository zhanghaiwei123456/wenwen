package io.file.read.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 1、编写一个程序，将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，
 * a.txt文件中的单词用回车符分隔，b.txt文件中用回车或空格进行分隔。
 * @author Administrator
 *
 */
public class FileWriterReader {

	public static void main(String[] args) throws IOException {
		FileManager a = new FileManager("d:"+File.separator+"a.txt",new char[]{'\n'});
		FileManager b = new FileManager("d:"+File.separator+"b.txt",new char[]{'\n',' '});		
		FileWriter c = new FileWriter("d:"+File.separator+"c.txt");
		String aWord = null;
		String bWord = null;
		while((aWord = a.nextWord()) !=null ){
			c.write(aWord + "\n");
			
		}
		
		while((bWord = b.nextWord()) != null){
			c.write(bWord + "\n");
		}	
		c.close();
	}

}
