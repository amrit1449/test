package jp.co.internous.action;

public class Main {
	public static void main(String[] args) {
		System.out.println("プロジェクト名は自由に決めてください。");
		System.out.println("パッケージ名は公開URLを逆さにして下さい。");
		System.out.println("クラス名の頭文字は大文字にしてください。");
		System.out.println("sysoまで入力してCtrl+SpaceでSystem.out.printlnを補完入力してくれます。");


		System.out.println(sum(2, 3));
		int total = sum(1, 1) + 10;
		System.out.println(total);
		System.out.println("intやcharなどのデータ型は総称してプリミティブ型といいます。");
		System.out.println("Stringは文字列という配列に格納しているので参照型(オブジェクト型)といいます。");
	}

	// 引数は型を指定して下さい。
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
}
