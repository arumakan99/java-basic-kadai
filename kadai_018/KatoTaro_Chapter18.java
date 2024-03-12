package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	public KatoTaro_Chapter18(){
	}
	
	//ゲッター
	public String getGivenName() {
		return this.givenName;
	}
	
	//セッター
	public void setGivenName(String givenName) {
		this.givenName="太郎";
	}
	
	//抽象メソッドのオーバーライド
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
	
}
