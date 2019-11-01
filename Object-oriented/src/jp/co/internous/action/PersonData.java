package jp.co.internous.action;

import java.util.LinkedHashMap;
import java.util.Map;

public class PersonData {

	public static void main(String[] args) {

		// インスタンス化
		Person user = new Person();
		user.name = "山田太郎";
		user.age = 20;

		System.out.println(user.name);
		System.out.println(user.age);

		// 配列として複数格納できる
		Map<String, Integer> users = new LinkedHashMap<String, Integer>();
		users.put("木村次郎", 18);
		users.put("鈴木花子", 16);
		users.put("大木弘樹", 24);

		for(Map.Entry<String, Integer> e : users.entrySet()) {
			System.out.println(e.getKey() + "\n" + e.getValue());
		}

		System.out.println("\n");

		user.phoneNumber = "090-1234-5678";
		user.address = "東京";
		System.out.println(user.phoneNumber);
		System.out.println(user.address + "\n");

		// 関数も呼び出せる
		user.talk();
		user.walk();
		user.run();

		Robot aibo = new Robot();
		aibo.name = "aibo";

		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name = "asimo";

		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name = "pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
