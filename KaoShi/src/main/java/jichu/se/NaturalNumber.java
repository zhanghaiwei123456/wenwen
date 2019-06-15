package jichu.se;
/**
 * 找出101到200自然数中的质数
 * @author Administrator
 *
 */
public class NaturalNumber {

	public static void main(String[] args) {
		for(int i=101;i<=200;i++) {
			boolean b = true;
			for(int n=2;n<i;n++) {
				if(i % n == 0) {//成立则不是不是素数
					b = false;
				}
			}
			if(b) {
				System.out.println(i);
			}
		}

	}

}
