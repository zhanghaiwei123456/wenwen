package regex.shenfenzheng;
/**输入一个email地址，
 * 之后使用正则表达式验证该email地址是否正确。
 * @author Administrator
 *
 */
public class EmailCheck {

	public static void main(String[] args) {
		String str = "mldnqa@163.net";
		String regex = "[a-zA-Z][a-zA-z_0-9\\.]*@[a-zA-Z_0-9\\\\.]+\\.(com|cn|net)";
        if(str.matches(regex)) {
        	System.out.println("TRUE，EMAIL输入合法。");
        }else {
        	System.out.println("FLASE，EMAIL输入非法！");
        }
	}

}
