package regex.shenfenzheng;
/**
 * ��д������ʽ��
 * �жϸ������Ƿ���һ���Ϸ���ip��ַ��
 */
public class IpSiteChecked {

	public static void main(String[] args) {
		String str = "192.168.1.3";
		String regex = "\\d{1,3}\\.\\d{1,3}.\\d{1,3}.\\d{1,3}";
		if(str.matches(regex)) {
			System.out.println("TRUE��IP��ַ����Ϸ���");
		}else {
			System.out.println("FLASE��IP��ַ����Ƿ���");
		}

	}

}
