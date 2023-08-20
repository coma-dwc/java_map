package map_repeat;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "Apple");
		map.put("b", "Banana");
		map.put("c", "Cherry");
		map.put("d", "Donut");
		map.put("e", "Egg");
		
		
		//キーを繰り返し処理
		//Mapのキーを全て出力
//		Iterator<String> it = map.keySet(). iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println(key);
//		}
		
		
		//Mapの値を繰り返し処理
		//Mapの値を全て出力
		//Mapのキーだけをコレクションとして取得：values()メソッド
		//そのkeySetからiterator()を取得することで繰り返し処理を行う
		//Iteratorの処理：hasNext()とnext()の組み合わせ
//		Iterator<String> it = map.values().iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println(key);
//		}
		
		
		//Mapのキーと値を繰り返し処理
		//entrySet()メソッド
//		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			Map.Entry<String, String> entry = it.next();
//			System.out.println(entry.getKey() + " = " + entry.getValue());
//		}
		
		
		//for文を使ってキーと値を繰り返し処理
//		for(Map.Entry<String, String> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " = " + entry.getValue());
//		}
		
		
		//forEachを使ってキーと値を繰り返し処理
		map.forEach((key, value) -> {
			System.out.println(key + " = " + value);
		});
	}
}