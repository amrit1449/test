package jp.co.internous.action;

public class Person {

		// インスタンスで格納する変数を宣言
		public String name = null;
		public int age = 0;

		public String phoneNumber = null;
		public String address = null;

		// 関数呼び出し
		public void talk() {
			System.out.println(this.name + "が話す");
		}

		public void walk() {
			System.out.println(this.name + "が歩く");
		}

		public void run() {
			System.out.println(this.name + "が走る");
		}
}
