package ji.he;
import ji.he.CommunicationRecord;
import ji.he.Record;
/**
 * ��дһ��list���ϣ��洢ͨѶ¼��ͬѧ�����͵绰�������ͨѶ¼
 * @author Administrator
 *
 */
public class AddressBookList{

	public static void main(String[] args) {
		CommunicationRecord c = new CommunicationRecord();
		c.add(new Record("������","111"));
		c.add(new Record("����","222"));
		c.add(new Record("����","333"));
		c.add(new Record("�ޱ","6667"));
		c.add(new Record("��ޱ","6668"));
		c.add(new Record("��ޱ","6669"));
		c.add(new Record("Сë","66610"));
		c.add(new Record("ëë","66611"));
		System.out.println(c);
	}
	

}
