package jp.co.internous.action;

// 子クラス implements インターフェース, インターフェース...(複数指定可)
// SmartPhone(子クラス)にインターフェースを格納したPhone(親クラス)を継承する
public class SmartPhone extends Phone implements Mp3Player, NewFunction {

	// Mp3Playerのインターフェースに従い同じメソッドを書く必要がある
	// 何がしたいかのルールを簡潔に見せるために使う？
	public void play() {
		System.out.println("再生");
	}

	public void stop() {
		System.out.println("停止");
	}

	public void next() {
		System.out.println("次へ");
	}

	public void back() {
		System.out.println("戻る");
	}
}
