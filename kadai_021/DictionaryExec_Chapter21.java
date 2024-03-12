package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		//辞書クラスのインスタンス作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//検索する単語の配列を作成
		String[] searchWords = {"apple", "banana", "grape", "orange"};
		
		//searchメソッド実行
		dictionary.search(searchWords);

	}
}