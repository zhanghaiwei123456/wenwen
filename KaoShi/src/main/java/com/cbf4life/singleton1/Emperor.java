package com.cbf4life.singleton1;
/**
 * 中国历史上一般都是只有一个朝代一个皇帝，有两个皇帝的话，必然要PK出来一个
 * @author Administrator
 *
 */
public class Emperor {
	private static Emperor emperor = null;//定义一个皇帝放在那里，然后给这个皇帝名字
	private Emperor(){
		//目的是为了不出现两个皇帝
	}
	@SuppressWarnings("unused")
	static Emperor getInstance(){
		if(emperor==null){//如果皇帝还没有定义那就定义一个
			emperor = new Emperor();
		}
		return emperor;
	}
	//皇帝的名字
	public static void emperIfo(){
		System.out.println("我是皇帝xxxxx");
	}
}
