package jichu.se;
/**
 * ��һ�����ӣ��ӳ�����3������ÿ���¶���һ�����ӣ�С���ӳ���ÿ�ĸ��º�
 * �ڸ�������һ�����ӣ��������Ӳ���������ÿ���µ����������Ƕ���
 * @author Administrator
 *
 */
public class RabbitTuZhi {

	public static void main(String[] args) {
		System.out.println("��1���µ����Ӷ�����  1");
		System.out.println("��2���µ����Ӷ�����  1");
		int f1 = 1,f2 = 1,f,M = 24;
		for(int i=3;i<=M;i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("�� 1"+i+"���µ����ӵĶ�����"+f2);
		}

	}

}
