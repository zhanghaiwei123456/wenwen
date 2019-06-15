package com.cbf4life.singleton1;
/**
 * 大臣是天天要见皇帝的，今天见到的皇帝和昨天的是一样的。
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class Minister {
	public static void main(String[] args) {
		//第一天
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperIfo();
		
		//第一天
		Emperor emperor2 = Emperor.getInstance();
		emperor2.emperIfo();
	}

}
