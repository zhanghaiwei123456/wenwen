package jichu.se;
/**
 * ��̬������ʵ������������
 * @author Administrator
 * 1.��̬����ǰҪ��static�ؼ��֣���ʵ�������򲻼ӣ�
 * 2.ʵ���������ڶ�������ԣ����봴��ʵ������
 * 3����̬����������ĳ��ʵ�����󣬶�������
 *
 */
public class BianLiangSattic {

	public static void main(String[] args) {
		/*
		 * ���۴������ٸ�ʵ��������Զ��ֻ����һ��staticVar����������ÿ������ʵ������
		 * ���staticVar�����1������ÿ����һ��ʵ������ͻ����һ��instancevar
		 */
		VariTest a = new VariTest();
		System.out.println(a);
		

	}
	public static class VariTest{
		public static int staticVar = 0;
		public int instanceVar = 0;
		public VariTest() {
			staticVar++;
			instanceVar++;
			System.out.println("staticVar="+staticVar+",instanceVar"+instanceVar);
		}
	}


}

