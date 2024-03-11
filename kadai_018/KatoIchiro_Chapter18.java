package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	
	public KatoIchiro_Chapter18() {
		this.givenName="一郎";
	}
	
	//ゲッター
	public String getGivenName() {
		return givenName;
	}
	
	//セッター
	public void setGivenName(String givenName) {
		this.givenName=givenName;
	}
	
	//抽象メソッドのオーバーライド
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
	
}
