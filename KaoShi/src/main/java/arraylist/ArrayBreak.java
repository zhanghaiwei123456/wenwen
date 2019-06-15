package arraylist;
/**
 * 跳出当前多重嵌套循环
 * @author Administrator
 *
 */
public class ArrayBreak {

	public static void main(String[] args) {
		//让外层循环条件表达式的结果可以受到里层循环体的代码控制
		int arr[][] = {{1,2,3},{4,5,6,7},{9}};
		boolean found = false;
		for(int i=0;i<arr[i].length&&!found;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("i="+i+"j="+j);
				if(arr[i][j] == 5) {
					found = true;
					break;
				}
			}
		}

	}

}
