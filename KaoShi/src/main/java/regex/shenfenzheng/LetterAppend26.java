package regex.shenfenzheng;
/**
 * 	定义一个StringBuffer类对象，
 * 然后通过append()方法向对象里添加26个小写字母，
 * 要求每次只添加一次，共添加26次。
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
