package ji.he;

import java.util.HashMap;
import java.util.Map;

/**
 * ����Map�������10��Ӣ�ĵ��ʵķ���
 * @author Administrator
 *
 */
public class MapFanXing {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("january", "һ��");
		map.put("Februuary", "����");
		map.put("March", "����");
		map.put("April", "����");
		map.put("May", "����");
		map.put("June", "����");
		map.put("July", "����");
		map.put("August", "����");
		map.put("September", "����");
		map.put("October", "ʮ");
		String str = "September";
		if(map.containsKey(str)) {
			System.out.println(map.get(str));
		}else {
			System.out.println("�ʿ���û�������");
		}
	}

}
