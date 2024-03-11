package kadai_018;

public abstract class Kato_Chapter18 {

	//姓フィールド
	String familyName="加藤";
	//名フィールド
	String givenName;
	//住所フィールド
	String address="東京都中野区〇×";
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce(String givenName) {
		this.givenName=givenName;
		System.out.println ("名前は"+familyName+this.givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	
	//個別の紹介を出力するメソッド
	abstract void eachIntroduce();
	
	//紹介を実行するメソッド
	public void execIntroduce(String givenName) {
		commonIntroduce(givenName);
		eachIntroduce();
		System.out.println();
	}
		
}
