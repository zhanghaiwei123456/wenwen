package thread;
/**
 * ����ģʽ
 * @author Administrator
 *
 */
public class SingletonPersonFactory {
	
	public static void main(String[] args) {
		SingletonPersonFactory.getInstance().toString();

	}
	
	//���췽��˽�л�
	public SingletonPersonFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	//���Լ������д���һ����ʵ��
	private static SingletonPersonFactory instance = null;
	//��һ��������ȡ��ʵ������
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
