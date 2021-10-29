//サンプル１演算出力
import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a, b, wa, sa, seki, sho;
		
        //２つの数値を入力
		System.out.print("1つ目の値を入力→");
		a = scn.nextDouble();
		System.out.print("2つ目の値を入力→");
		b = scn.nextDouble();
		
		//２つの数値の四則演算を行う
		wa = a + b;
		sa = a - b;
		seki = a * b;
		sho = a / b;
		
        //演算結果を画面に表示する
		System.out.print(" 加算結果＝" + wa);
		System.out.print(" 減算結果＝" + sa);
		System.out.print(" 乗算結果＝" + seki);
		System.out.print(" 除算結果＝" + sho);
	}
}
