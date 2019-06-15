package ji.he;
import ji.he.CommunicationRecord;
import ji.he.Record;
/**
 * 编写一个list集合，存储通讯录（同学姓名和电话）并输出通讯录
 * @author Administrator
 *
 */
public class AddressBookList{

	public static void main(String[] args) {
		CommunicationRecord c = new CommunicationRecord();
		c.add(new Record("吴青青","111"));
		c.add(new Record("青青","222"));
		c.add(new Record("吴青","333"));
		c.add(new Record("李凯薇","6667"));
		c.add(new Record("凯薇","6668"));
		c.add(new Record("郭薇","6669"));
		c.add(new Record("小毛","66610"));
		c.add(new Record("毛毛","66611"));
		System.out.println(c);
	}
	

}
