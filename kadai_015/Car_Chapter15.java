package kadai_015;

//車クラス
public class Car_Chapter15{

	//フィールド（内部データ）
	private int gear=1;//ギア
	private int speed=10;//速度（km）

	//コンストラクタ（初期化設定）
	public Car_Chapter15(int gear, int speed) {
		this.gear=gear;
		this.speed=speed;
		
		System.out.print("ギア"+this.gear+"から");
	}
	
	//gearChangeメソッド：ギアの値により速度を変える
	public void gearchange(int afterGear) {
		this.gear=afterGear;
		switch(afterGear) {
		case 1 -> speed=10;
		case 2 -> speed=20;
		case 3 -> speed=30;
		case 4 -> speed=40;
		case 5 -> speed=50;
		default -> speed=10;
		}
	}
	
	//runメソッド：ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println(this.gear+"に切り替えました");
		System.out.println("速度は時速"+this.speed+"kmです");
	}
}