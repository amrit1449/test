package jp.co.internous.action;

// interface = ルールの処理
public interface Mp3Player {

	// abstract = 抽象メソッド(処理なし)
	public abstract void play();
	public abstract void stop();
	public abstract void next();
	public abstract void back();

}
