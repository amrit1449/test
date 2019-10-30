package jp.co.internous.action;

import java.util.LinkedHashMap;
import java.util.Map;

public class PersonData {

	public static void main(String[] args) {
		Person user = new Person();
		user.name = "山田太郎";
		user.age = 20;

		System.out.println(user.name);
		System.out.println(user.age);

		Map<String, Integer> users = new LinkedHashMap<String, Integer>();
		users.put("木村次郎", 18);
		users.put("鈴木花子", 16);
		users.put("大木弘樹", 24);

		for(Map.Entry<String, Integer> e : users.entrySet()) {
			System.out.println(e.getKey() + "\n" + e.getValue());
		}
	}
}
