package io.file.read.writer;
/**
 * ���������ֵĽ��ת�����й���ͳ����ʽ��
 * ����1011��--��(һǧ��һʰ������)
 * @author Administrator
 *
 */
public class MoneyFomat {
	private static final char[] data = new char[]{'1','2','3','4','5','6','7','8','9','0'};
	private static final char[] units = new char[] {'A','B','C','D','E','ʰ','F','F','H'};
	public static void main(String[] args) {
		System.out.println(conver(135677));
	}
	public static String conver(int money) {
		StringBuffer sbf = new StringBuffer();
		int unit = 0;
		while(money != 0) {
			sbf.insert(0,units[unit++]);
			int number = money%10;
			sbf.insert(0, data[number]);
			money/=10;
		}
		return sbf.toString();
		
	}

}
