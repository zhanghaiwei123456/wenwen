package thread;
/**
 * 单例模式
 * @author Administrator
 *
 */
public class SingletonPersonFactory {
	
	public static void main(String[] args) {
		SingletonPersonFactory.getInstance().toString();

	}
	
	//构造方法私有化
	public SingletonPersonFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	//在自己的类中创建一个单实例
	private static SingletonPersonFactory instance = null;
	//供一个方法获取该实例对象
	public synchronized static SingletonPersonFactory getInstance() {
		if(instance == null) {
			instance = new SingletonPersonFactory();
		}
		return instance;
	}

	public void setInstance(SingletonPersonFactory instance) {
		this.instance = instance;
	}

	
}
