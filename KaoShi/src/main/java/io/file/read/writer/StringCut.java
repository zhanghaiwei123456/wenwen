package io.file.read.writer;

import java.util.Arrays;

/**
 * 编写程序将截取："ABC137GMNQQ2049PN5FFF",输出结果0123445556
 * @author Administrator
 *
 */
public class StringCut {

	public static void main(String[] args) {
		/*
		 * String：适用于少量的字符串操作的情况
		 * StringBuilder：适用于单线程下在字符缓冲区进行大量操作的情况(是线程不安全的)
		 * StringBuffer：适用多线程下在字符缓冲区进行大量操作的情况(是线程安全的)
		 */
		String str = "ABC137GMNQQ2049PN5FFF";
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);//harAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
			if(c >= '0' && c<='9') {
				stringBuilder.append(c);
			}
		}
		System.out.println(stringBuilder);
		char[] arry = stringBuilder.toString().toCharArray();
		Arrays.sort(arry);
		System.out.println(arry);

	}

}
