package com.cbf4life.singleton1;
/**
 * ��������Ҫ���ʵ۵ģ���������Ļʵۺ��������һ���ġ�
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class Minister {
	public static void main(String[] args) {
		//��һ��
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperIfo();
		
		//��һ��
		Emperor emperor2 = Emperor.getInstance();
		emperor2.emperIfo();
	}

}
