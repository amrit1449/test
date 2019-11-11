
public class CheckLoadJDBC {

	// 例外は投げる設定
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		String msg = "";

		// 例外処理
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "ドライバのロードに成功しました。";
		} catch(ClassNotFoundException e) {
			msg = e + "ドライバのロードに失敗しました。";
		}

		System.out.println(msg);
	}
}
