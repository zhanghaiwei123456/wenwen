package jichu.se;
/**
 * �ҳ�101��200��Ȼ���е�����
 * @author Administrator
 *
 */
public class NaturalNumber {

	public static void main(String[] args) {
		for(int i=101;i<=200;i++) {
			boolean b = true;
			for(int n=2;n<i;n++) {
				if(i % n == 0) {//�������ǲ�������
					b = false;
				}
			}
			if(b) {
				System.out.println(i);
			}
		}

	}

}
