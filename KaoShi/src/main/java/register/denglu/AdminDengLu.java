package register.denglu;

import java.util.Scanner;
/**
 * ��ʾ�û��������룬����admin,���¼�ɹ����粻�����¼ʧ�ܣ����û��������롣
 * ����û�����3����֤ʧ�ܣ���������ֹ����
 * @author Administrator
 *
 */
public class AdminDengLu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
        while(true) {
        	System.out.println("�������ʺţ�");
        	String name = sc.nextLine();
        	System.out.println("���������룺");
        	String pwd = sc.nextLine();
        	if("admin".equals(name)&&"admin".equals(pwd)) {
        		System.out.println("��¼�ɹ���");
        		break;
        	}else {
        		count++;
        		if(count<3) {
        			System.out.println("��¼ʧ�ܣ����������롣");
        		}else {
        			System.out.println("��¼�������࣬��֤ʧ�ܡ�");
        			break;
        		}
        	}
        }
	}

}
