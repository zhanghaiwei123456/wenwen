package io.file.read.writer;

import java.util.Arrays;

/**
 * ��д���򽫽�ȡ��"ABC137GMNQQ2049PN5FFF",������0123445556
 * @author Administrator
 *
 */
public class StringCut {

	public static void main(String[] args) {
		/*
		 * String���������������ַ������������
		 * StringBuilder�������ڵ��߳������ַ����������д������������(���̲߳���ȫ��)
		 * StringBuffer�����ö��߳������ַ����������д������������(���̰߳�ȫ��)
		 */
		String str = "ABC137GMNQQ2049PN5FFF";
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);//harAt() �������ڷ���ָ�����������ַ���������ΧΪ�� 0 �� length() - 1��
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
