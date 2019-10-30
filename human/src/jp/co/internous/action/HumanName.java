package jp.co.internous.action;

public class HumanName {

	// クラス間変数(このプロジェクト内でのみ使用可能)
	public String lastName;

	// メソッド間変数(このクラス内のみ使用可能)
	private String firstName;

	public String getName() {
		firstName = "山田";
		lastName = "太郎";

		String myName = firstName + lastName;
		return myName;
	}



}
