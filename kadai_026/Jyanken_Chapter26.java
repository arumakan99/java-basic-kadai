package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//getMyChoiceメソッド：自分のじゃんけんの手を入力する
	public String getMyChoice(){

		//指示を表示する
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//入力された自分のじゃんけんの手を取得する
		Scanner scanner = new Scanner(System.in);
		String myHand = scanner.next();

		//正しいじゃんけんの手であるか判定する
		if(!(myHand.equals("r") || myHand.equals("s") || myHand.equals("p"))) {
			//エラー文表示
			System.out.println("正しいじゃんけんの手を入力してください");
			//Scannerクラスに戻る
			return getMyChoice();
		}

		//正しいじゃんけんの手が入力された後にScannerクラスをクローズする
		scanner.close();
		
		//自分のじゃんけんの手を返す
		return myHand;

	}

	//getRandomメソッド：対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {

		//配列にじゃんけんの手をセットする
		String[] handList = {"r", "s", "p"};

		//乱数で対戦相手のじゃんけんの手を選ぶ
		//0以上1未満の乱数に3を掛けることで0以上3未満の乱数を生成し、小数点以下を切り捨てる
		int enemyHandIndex = (int)Math.floor(Math.random()*3);
		//乱数で選ばれたenemyHandIndexに対応する要素をhandListから取得し、変数enemyHandに入れる
		String enemyHand = handList[enemyHandIndex];
		
		//対戦相手のじゃんけんの手を返す
		return enemyHand;

	}

	//playGameメソッド：じゃんけんを行う
	public void playGame(String myHand, String enemyHand) {
		
		//じゃんけんの手を整理する
		HashMap<String, String> map = new HashMap<>();
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		
		//自分と対戦相手のじゃんけんの手を出力する
		System.out.println("自分の手は"+map.get(myHand)+",対戦相手の手は"+map.get(enemyHand));

		//自分と対戦相手のじゃんけんの手を比較する
		String result = "";
		if(myHand.equals(enemyHand)) {
			result = "あいこです";
		}else if((myHand.equals("r") && enemyHand.equals("s")) || (myHand.equals("s") && enemyHand.equals("p")) || (myHand.equals("p") && enemyHand.equals("r"))){
			result = "自分の勝ちです";
		}else{
			result = "自分の負けです";
		}

		//結果を表示する
		System.out.println(result);

	}

}