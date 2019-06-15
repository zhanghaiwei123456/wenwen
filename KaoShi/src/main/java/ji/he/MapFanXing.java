package ji.he;

import java.util.HashMap;
import java.util.Map;

/**
 * 基于Map泛型完成10个英文单词的翻译
 * @author Administrator
 *
 */
public class MapFanXing {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("january", "一月");
		map.put("Februuary", "二月");
		map.put("March", "三月");
		map.put("April", "四月");
		map.put("May", "五月");
		map.put("June", "六月");
		map.put("July", "七月");
		map.put("August", "八月");
		map.put("September", "九月");
		map.put("October", "十");
		String str = "September";
		if(map.containsKey(str)) {
			System.out.println(map.get(str));
		}else {
			System.out.println("词库里没有这个词");
		}
	}

}
