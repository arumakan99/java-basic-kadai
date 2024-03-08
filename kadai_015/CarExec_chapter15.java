package kadai_015;

public class CarExec_chapter15 {

	public static void main(String[] args) {
		
		//車クラスのインスタンス作成
		Car_Chapter15 car1=new Car_Chapter15(1,10);
		
		//gearChangeメソッド実行
		car1.gearchange(3);
		
		//runメソッド実行
		car1.run();
		
	}

}
