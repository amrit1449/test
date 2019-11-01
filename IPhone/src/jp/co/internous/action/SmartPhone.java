package jp.co.internous.action;

// extends = 継承
// public class 子クラス extends 親クラス
public class SmartPhone extends Mp3Player{
	// コンストラクタをオーバーライド(上書き)
	// 処理によって動作を変えたいときに使う？
	public void play() {
		System.out.println("再生（ハイレゾ機能）");
	}

	public void stop() {
		System.out.println("停止（ハイレゾ機能）");
	}

	public void next() {
		System.out.println("次へ（ハイレゾ機能）");
	}

	public void back() {
		System.out.println("戻る（ハイレゾ機能）");
	}
// Mp3Playerに追加されたコンストラクタ
	public void call() {
		System.out.println("電話");
	}

	public void mail() {
		System.out.println("メール");
	}

	public void photo() {
		System.out.println("写真");
	}

	public void internet() {
		System.out.println("インターネット");
	}
}
