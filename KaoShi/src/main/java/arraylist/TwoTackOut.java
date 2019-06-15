package arraylist;

public class TwoTackOut {

	public static void main(String[] args) {
		int[] b = new int[]{2,3,4,34,12};//...存入98个随机的1~100的整数
        int[] a = new int[]{100};
        for(int t:b) {
        	a[t-1] = t;
        }
        for(int t=0;t<a.length;t++) {
        	if(a[t]==0) {
        		System.out.println(t+1);
        	}
        }
	}

}
