package jichu.se;
/**
 * 有一对兔子，从出生第3个月起每个月都生一对兔子，小兔子长到每四个月后
 * 第个月又生一对兔子，假如兔子不会死，问每个月的兔子总数是多少
 * @author Administrator
 *
 */
public class RabbitTuZhi {

	public static void main(String[] args) {
		System.out.println("第1个月的兔子对数：  1");
		System.out.println("第2个月的兔子对数：  1");
		int f1 = 1,f2 = 1,f,M = 24;
		for(int i=3;i<=M;i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("第 1"+i+"个月的兔子的对数："+f2);
		}

	}

}
