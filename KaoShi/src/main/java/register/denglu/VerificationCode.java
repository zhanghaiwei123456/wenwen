package register.denglu;

import java.util.Arrays;
/**
 * 生成一个六位数的验证码
 * @author Administrator
 *
 */
public class VerificationCode {

	public static void main(String[] args) {
		String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
				"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
				"0","1","2","3","4","5","6","7","8","9"};
		boolean[] flags = new boolean[letters.length];
		String[] chs = new String[6];
		for(int i=0;i<chs.length;i++) {
			int index;
			do {
				index = (int) (Math.random()*(letters.length));
			}while(flags[index]);
			chs[i] = letters[index];
			flags[index] = true;
		}
		String code = Arrays.toString(chs);
		System.out.println(code);
		System.out.println(4*366*5);


	}

}
