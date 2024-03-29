package jp.co.internous.action;

public class Test {

	public static void main(String[] args) {
		// 指定なしのインスタンス化
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age + "\n");

		// コンストラクタにしたインスタンス化
		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age + "\n");

		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age + "\n");

		Person no_name = new Person(25);
		System.out.println(no_name.name);
		System.out.println(no_name.age + "\n");

		Person hanako = new Person(17, "hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}

}
