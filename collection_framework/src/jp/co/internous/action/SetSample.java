package jp.co.internous.action;

import java.util.HashSet;
import java.util.Set;

// 配列の重複防止版…DB操作で使える？
public class SetSample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("value1");
		set.add("value2");
		set.add("value3");
		set.add("value4");
		set.add("value5");

		// 重複した値は無視される
		set.add("value2");

		// HashSetの場合、登録順は無視される
		// 昇順ならTreeSet, 降順ならLinkedHashSetと使い分けること
		for (String s : set) {
			System.out.println(s);
		}
	}

}
