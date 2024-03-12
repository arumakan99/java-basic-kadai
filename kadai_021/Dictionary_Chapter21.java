package kadai_021;
import java.util.HashMap;

class Dictionary_Chapter21 {

	//HashMapインスタンスを作成
	private HashMap<String, String>dictionary = new HashMap<>();

	//コンストラクタ作成（辞書単語登録）
	public Dictionary_Chapter21() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	//searchメソッド作成：辞書を検索する
	public void search(String[] searchWords) {		
		//拡張for文
		for(String word:searchWords) {
			String meaning = dictionary.get(word);
			if(meaning != null) {
				System.out.println(word+"の意味は"+meaning);
			}else {
				System.out.println(word+"は辞書に存在しません");
			}
		}
	}
}