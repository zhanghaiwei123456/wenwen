package jichu.se;
/**
 * 静态变量和实例变量的区别
 * @author Administrator
 * 1.静态变量前要加static关键字，而实例变量则不加；
 * 2.实例变量属于对象的属性，必须创建实例对象；
 * 3。静态变量不属于某个实例对象，而属于类
 *
 */
public class BianLiangSattic {

	public static void main(String[] args) {
		/*
		 * 无论创建多少个实例对象，永远都只分配一个staticVar变量，并且每创建个实例对象，
		 * 这个staticVar都会加1，但是每创建一个实例对象就会分配一个instancevar
		 */
		VariTest a = new VariTest();
		System.out.println(a);
		

	}
	public static class VariTest{
		public static int staticVar = 0;
		public int instanceVar = 0;
		public VariTest() {
			staticVar++;
			instanceVar++;
			System.out.println("staticVar="+staticVar+",instanceVar"+instanceVar);
		}
	}


}

