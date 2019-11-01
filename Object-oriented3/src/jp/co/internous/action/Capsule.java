package jp.co.internous.action;

public class Capsule {

	public static void main(String[] args) {
		// インスタンス化
		Person taro = new Person("山田太郎", 20);

		// publicじゃないとスコープ範囲外
		// System.out.println(taro.name);

		// インスタンス化したときの名前を取得
		System.out.println(taro.getName());
		// nameに代入
		taro.setName("花子");
		// 出力は'花子'になる
		System.out.println(taro.getName());

		System.out.println(taro.getAge());
		taro.setAge(30);
		System.out.println(taro.getAge());

	}

}
