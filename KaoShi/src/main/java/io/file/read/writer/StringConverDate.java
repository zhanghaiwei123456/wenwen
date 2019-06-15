package io.file.read.writer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**'
 * 编写程序，将字符串“1981-09-19 09:07:27.727”变为Date型数据。
 * @author Administrator
 *
 */
public class StringConverDate {

	public static void main(String[] args) throws ParseException {
		String str = "1981-09-19 09:07:27.727";		// 字符串
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.sss");
		Date date = sdf.parse(str);//parse() 方法可解析一个日期时间字符串
		System.out.println(date);

	}

}
