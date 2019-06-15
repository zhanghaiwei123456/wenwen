package regex.shenfenzheng;
/**
 * 编写正则表达式，
 * 判断给定的是否是一个合法的ip地址。
 */
public class IpSiteChecked {

	public static void main(String[] args) {
		String str = "192.168.1.3";
		String regex = "\\d{1,3}\\.\\d{1,3}.\\d{1,3}.\\d{1,3}";
		if(str.matches(regex)) {
			System.out.println("TRUE，IP地址输入合法。");
		}else {
			System.out.println("FLASE，IP地址输入非法！");
		}

	}

}
