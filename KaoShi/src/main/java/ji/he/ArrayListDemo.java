package ji.he;

import java.util.ArrayList;

/**
 * ͨ��һ��ѭ�������һ��ArrayList�еĵڸ�Ԫ��
 * @author Administrator
 *
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		for(int i=list.size()-1;i>0;i--) {
			list.remove(i);
		}
		System.out.println(list);

	}

}
