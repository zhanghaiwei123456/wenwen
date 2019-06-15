package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		Integer[] array = {1,3,4,6,8};
		List<Integer> list1 = Arrays.asList(array);
		System.out.println(list1);
		
		Integer[] array2 = {2,5,9};
		List<Integer> list2 = Arrays.asList(array2);
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
		
		List<String> list=new ArrayList<String>();
		
	} 

}
