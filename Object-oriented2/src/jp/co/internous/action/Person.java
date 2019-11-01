package jp.co.internous.action;

public class Person {
	public String name = null;
	public int age = 0;

	// コンストラクタ(指定なし)
	public Person(){}

	// コンストラクタ(データ型あり)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 初期値をたくさん作れる
	public Person(String name) {
		this.name = name;
		this.age = 0;
	}

	// 指定の仕方でここにあるコンストラクタが使い分けられる
	public Person(int age) {
		this.name = "名前なし";
		this.age = age;
	}

	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}
}
