package drive08_A;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// initialize
		List<Cat> catsList = new ArrayList<Cat>();
		char[] names = {'A', 'B', 'C'};
		int selectNum = 0;

		System.out.println("*** キャット コレクション ***");
		while (selectNum != 3) {
			System.out.println("------------------------------------------");
			System.out.println("1.コレクト 2.遊ぶ 3.終了");
			selectNum = new java.util.Scanner(System.in).nextInt();
			switch(selectNum) {
			case 1:
				catAdd(catsList, names);
				break;
			case 2:
				catPlay(catsList);
				break;
			}// switch
		}// while
		System.out.println("アプリを終了します。");
	}// main

// ■■■■■■■■ ■■■■■■■■
// Method to add a cat
	public static void catAdd(List<Cat> catsList, char[] names) {
		char typeName = names[new java.util.Random().nextInt(names.length)];
		System.out.println(typeName+"タイプのキャットが登場しました");
		System.out.println("名前は何にしますか？");
		String inputName = new java.util.Scanner(System.in).nextLine();
		System.out.println(inputName+"が仲間になった!");
		catsList.add(new Cat(typeName, inputName));
	}// catAdd

// ■■■■■■■■ ■■■■■■■■
// Method to play with a cat
	public static void catPlay(List<Cat> catsList){
		if(catsList.size() > 0) {
			for(int i=0; i < catsList.size(); i++) {
				System.out.println(i + "…" + catsList.get(i).getName() +
						"[" + catsList.get(i).getType() + "]" +
						"(" + catsList.get(i).getIntimacy() + ")");
			}// for
			System.out.println("どの子と遊びますか？");
			int selectCatNum = new java.util.Scanner(System.in).nextInt();
			if(selectCatNum >= 0 && selectCatNum < catsList.size()) {
				System.out.println(catsList.get(selectCatNum).getName()+"と遊んだ!");
				System.out.println("親密度がＵＰした!!");
				catsList.get(selectCatNum).play();
			} else {
				System.out.println("選択した番号が範囲外です");
			}
		} else {
			System.out.println("キャットがいません");
		}
	}// catPlay
}// class
