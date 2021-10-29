//mainメソッドの引数と1次元配列
public class sample2 {

	public static void main(String[] args) {
		int max,min,i,num;
		
		max = Integer.MAX_VALUE;
		min = Integer.MIN_VALUE;
		for (i = 0;i < args.length; i++) {
			num = Integer.parseInt(args[i]);
			if (max < num) {
				max = num;				
			}
			if (min < num) {
				min = num;
			}	
		}
		
		System.out.println("最大値 = " + max);
		System.out.println("最小値 = " + min);
	}
}
