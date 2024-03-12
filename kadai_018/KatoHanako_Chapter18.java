package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	
	public KatoHanako_Chapter18() {
	}
	
	//ゲッター
	public String getGivenName() {
		return givenName;
	}
	
	//セッター
	public void setGivenName(String givenName) {
		this.givenName="花子";
	}
	
	//抽象メソッドのオーバーライド
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
	
}
