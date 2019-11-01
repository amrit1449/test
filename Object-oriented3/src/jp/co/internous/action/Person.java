package jp.co.internous.action;

public class Person {
	private String name = null;
	private int age = 0;

	// コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 名前取得
	public String getName() {
		return this.name;
	}

	// 名前指定
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
