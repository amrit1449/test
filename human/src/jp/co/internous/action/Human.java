package jp.co.internous.action;

public class Human {

	public static void main(String[] args) {

		// オブジェクトを作成する
		HumanName userName = new HumanName();
		HumanAge userAge = new HumanAge();
		HumanAddress userAddress = new HumanAddress();

		// オブジェクトの関数を引っ張ってくる
		System.out.println(userName.getName());
		System.out.println(userAge.getAge());
		System.out.println(userAddress.getAddress());
	}

}
