package ji.he;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * ������List<Integer>,дһ������Ҫ��ϲ��������ϣ��������ظ��ģ�
 * ���ü���sort�ȷ���������Ҫ���м��������������𽥼�С
 * �磨m �Ǽ��ϵ� size��(get(0)<get(m-1),get(1)<get(m-2);)
 * @author Administrator
 *
 */
public class HeBingList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(12);
		list2.add(31);
		list2.add(43);
		list2.add(15);
		list2.add(16);
		list2.add(25);
		list2.add(26);
		
		TreeSet<Integer> set = new TreeSet<Integer>(list1);
		set.addAll(list2);
		List<Integer> ss = new ArrayList<Integer>(set);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<ss.size();i=i+2) {
			list.add(ss.get(i));
		}
		for(int i=(ss.size())/2*2-1;i>0;i=i-2) {
			list.add(ss.get(i));
		}
		System.out.println(list);
	}

}
