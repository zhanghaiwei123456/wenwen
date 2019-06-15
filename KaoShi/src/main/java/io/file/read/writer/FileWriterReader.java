package io.file.read.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 1����дһ�����򣬽�a.txt�ļ��еĵ�����b.txt�ļ��еĵ��ʽ���ϲ���c.txt�ļ��У�
 * a.txt�ļ��еĵ����ûس����ָ���b.txt�ļ����ûس���ո���зָ���
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
