package register.denglu;

import java.util.Scanner;
/**
 * 提示用户名和密码，都是admin,则登录成功，如不是则登录失败，让用户重新输入。
 * 如果用户连续3次认证失败，则锁定终止程序
 * @author Administrator
 *
 */
public class AdminDengLu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
        while(true) {
        	System.out.println("请输入帐号：");
        	String name = sc.nextLine();
        	System.out.println("请输入密码：");
        	String pwd = sc.nextLine();
        	if("admin".equals(name)&&"admin".equals(pwd)) {
        		System.out.println("登录成功。");
        		break;
        	}else {
        		count++;
        		if(count<3) {
        			System.out.println("登录失败，请重新输入。");
        		}else {
        			System.out.println("登录次数过多，认证失败。");
        			break;
        		}
        	}
        }
	}

}
