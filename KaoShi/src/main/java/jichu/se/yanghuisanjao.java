package jichu.se;

public class yanghuisanjao {

	public static void main(String[] args) {
		int n = 6;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			//��ӡ�ո������ַ����ӵ�һ�п�ʼ�����ӡ
			for(int j=1;j<=i;j++){
				System.out.print(num(i,j)+" ");
			}
			System.out.println();
		}
		
	}
	public static int num(int x,int y){//��x�У���y��
		if(y==1 || y==x){
			return 1;
		}
		int c = num(x-1,y-1)+num(x-1,y);
		return c;
	}

}
