package jichu.se;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * 创建和迭代一个List和Set
 * @author Administrator
 * 创建和迭代一个Map
 */
public class DieDai {

	public static void main(String[] args) {
		//创建和迭代一个List
		List<String> names = new ArrayList<String>();
		names.add("吴青青");
		names.add("青青");
		names.add("吴青");
		names.add("凯薇");
		for(int i=0;i<names.size();i++) {
			String str = names.get(i);
			System.out.println(str);
		}
		
		////创建和迭代一个Set
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String egg = ite.next();
			System.out.println(egg);
		}
		
		//创建和迭代一个Map
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("吴青青", 30);
		map.put("qing", 28);
		map.put("青青", 33);
		Set<Entry<String,Integer>> entryset = map.entrySet();
		for(Entry<String,Integer> entry:entryset) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
