package io.file.read.writer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**'
 * ��д���򣬽��ַ�����1981-09-19 09:07:27.727����ΪDate�����ݡ�
 * @author Administrator
 *
 */
public class StringConverDate {

	public static void main(String[] args) throws ParseException {
		String str = "1981-09-19 09:07:27.727";		// �ַ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.sss");
		Date date = sdf.parse(str);//parse() �����ɽ���һ������ʱ���ַ���
		System.out.println(date);

	}

}
