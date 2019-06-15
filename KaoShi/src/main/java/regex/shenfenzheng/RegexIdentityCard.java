package regex.shenfenzheng;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �ж����֤��Ҫô��15λ��Ҫô��18λ�����һλ����Ϊ��ĸ����д����������е������ա�
 * @author Administrator
 * ��Ϊ15λ��18λ�����֤���붼�Ǵ�7λ����12λΪ���֤Ϊ�������͡�
 * �������ǿ�����Ƴ�����ȷ������ģʽ��ʹ���֤�ŵ����ںϷ���
 * �������ǵ�����ģʽ���Խ�һ�������ڲ��ֵ������޸�Ϊ[12][0-9]{3}[01][0-9][123][0-9]��
 * ��Ȼ���Ը���ȷ���������ڡ�
 *
 */
public class RegexIdentityCard {

	public static void main(String[] args) {
		// �����Ƿ�Ϊ�Ϸ������֤����
		String[] strs = { "130681198712092019", "13068119871209201x",
				"13068119871209201", "123456789012345", "12345678901234x",
				"1234567890123" };
		Pattern p1 = Pattern.compile("(\\d{17}[0-9a-zA-Z]|\\d{14}[0-9a-zA-Z])");//Pattern pattern = Pattern.compile("abc+");  jdk���ͣ���������������ʽ���뵽 ģʽ �С�
		for (int i = 0; i < strs.length; i++) {
			Matcher matcher = p1.matcher(strs[i]);
			System.out.println(strs[i] + ":" + matcher.matches());
		}
		Pattern p2 = Pattern.compile("\\d{6}(\\d{8}).*"); // ������ȡ�������ַ���
		Pattern p3 = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");// ���ڽ������ַ������зֽ�Ϊ������
		for(int i=0;i<strs.length;i++){
			Matcher matcher = p2.matcher(strs[i]);
			boolean b = matcher.find();
			if(b){
				String s = matcher.group(1);
				Matcher matcher2 = p3.matcher(s);
				if(matcher2.find()){
					System.out.println("����Ϊ" + matcher2.group(1) + "��"+ matcher2.group(2) + "��"+ matcher2.group(3) + "��");
				}
			}
		}
	}


}
