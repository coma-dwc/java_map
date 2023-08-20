package java_map_difference;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//public class Main {
//	private static void testMap(Map<String, String> map) {
//		map.put("alpha", "α");
//		map.put("beta", "β");
//		map.put("gamma", "γ");
//		map.put("delta", "δ");
//		map.put("epsilon", "ε");
//		map.put("zeta", "ζ");
//		map.put("eta", "η");
//		map.put("theta", "θ");
//		
//		System.out.println(map.getClass());
//		map.forEach((key, value) -> {
//			System.out.println(key + " = " + value);
//		});
//	}
//	public static void main(String[] args) {
//		testMap(new HashMap<String, String>());
//		testMap(new TreeMap<String, String>());
//		testMap(new LinkedHashMap<String, String>());
//	}
//	//HashMapではキーの並び順は不定
//	//TreeMapではキーの並び順は辞書順
//	//LinkedHashMapではキーの並び順は追加順
//}

//独自クラスをキーに使う
//Stringをラップする独自クラスMyKeyを定義してそれをMapのキーとして使用

//MyKeyクラスにComparableインターフェースを実装
class MyKey implements Comparable<MyKey> {
	
	private String key;
	
	public MyKey(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return this.key;
	}
	
	
	@Override
	public String toString() {
		return this.key;
	}
	
	//HashMapでキーとして使えるようにする
	//MyKeyクラスにint hashCodeメソッドを定義
	@Override
	public int hashCode() {
		return this.key.hashCode();
	}
	
	///MyKeyクラスにboolean equalsメソッドを定義
	@Override
	public boolean equals(Object obj) {
		return obj instanceof MyKey && this.key.equals(((MyKey)obj).key);
	}
	
	public int compareTo(MyKey o) {
		return this.key.compareTo(o.getKey());
	}

}

public class Main {
	private static void testMap(Map<MyKey, String> map) {
		map.put(new MyKey("alpha"), "α");
		map.put(new MyKey("beta"), "β");
		map.put(new MyKey("gamma"), "γ");
		map.put(new MyKey("delta"), "δ");
		map.put(new MyKey("epsilon"), "ε");
		map.put(new MyKey("zeta"), "ζ");
		map.put(new MyKey("eta"), "η");
		map.put(new MyKey("theta"), "θ");
		
		System.out.println(map.getClass());
		for(MyKey key : map.keySet()) {
			MyKey alternativeKey = new MyKey(key.getKey());
			System.out.println(key + " = " + map.get(key) + " = " + map.get(alternativeKey));
		}
	}
	public static void main(String[] args) {
		testMap(new HashMap<MyKey, String>());
		testMap(new LinkedHashMap<MyKey, String>());
		testMap(new TreeMap<MyKey, String>());
	}
	
	//HashMapとLinkedHashMapで、同じMyKeyのインスタンスを使用している場合は、getで値が取得できているが、
	//同じ値を持つMyKeyを新たに生成した場合は返り値がnullになっている
	//TreeMapではmap.putのところで実行時エラーになる(MyKeyクラスがMapのキーとして備えるべきメソッドを定義していないため)
}