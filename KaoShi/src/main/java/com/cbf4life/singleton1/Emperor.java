package com.cbf4life.singleton1;
/**
 * �й���ʷ��һ�㶼��ֻ��һ������һ���ʵۣ��������ʵ۵Ļ�����ȻҪPK����һ��
 * @author Administrator
 *
 */
public class Emperor {
	private static Emperor emperor = null;//����һ���ʵ۷������Ȼ�������ʵ�����
	private Emperor(){
		//Ŀ����Ϊ�˲����������ʵ�
	}
	@SuppressWarnings("unused")
	static Emperor getInstance(){
		if(emperor==null){//����ʵۻ�û�ж����ǾͶ���һ��
			emperor = new Emperor();
		}
		return emperor;
	}
	//�ʵ۵�����
	public static void emperIfo(){
		System.out.println("���ǻʵ�xxxxx");
	}
}
