package regex.shenfenzheng;
/**����һ��email��ַ��
 * ֮��ʹ��������ʽ��֤��email��ַ�Ƿ���ȷ��
 * @author Administrator
 *
 */
public class EmailCheck {

	public static void main(String[] args) {
		String str = "mldnqa@163.net";
		String regex = "[a-zA-Z][a-zA-z_0-9\\.]*@[a-zA-Z_0-9\\\\.]+\\.(com|cn|net)";
        if(str.matches(regex)) {
        	System.out.println("TRUE��EMAIL����Ϸ���");
        }else {
        	System.out.println("FLASE��EMAIL����Ƿ���");
        }
	}

}
