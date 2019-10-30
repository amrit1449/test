package jp.co.internous.action;

import java.util.HashMap;
import java.util.Map;

// 連想配列
public class MapSample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");

		String val = map.get("key1");
		System.out.println(val);

		String valNull = map.get("key6");
		System.out.println(valNull);

		// map.containsKey || map.containsValue
		if(map.containsKey("key1")) {
			System.out.println("key1は存在します");
		} else {
			System.out.println("key1は存在しません");
		}

		// 普通のint=0;から始まるforでも取得はできる
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
