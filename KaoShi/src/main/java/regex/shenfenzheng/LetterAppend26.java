package regex.shenfenzheng;
/**
 * 	����һ��StringBuffer�����
 * Ȼ��ͨ��append()��������������26��Сд��ĸ��
 * Ҫ��ÿ��ֻ���һ�Σ������26�Ρ�
 * @author Administrator
 *
 */
public class LetterAppend26 {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		for(char c='a';c<='z';c++) {
			buf.append(c);
		}
		
		System.out.println(buf);

	}

}
