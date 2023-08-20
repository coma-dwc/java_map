package java_map_difference;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	private static void testMap(Map<String, String> map) {
		map.put("alpha", "α");
		map.put("beta", "β");
		map.put("gamma", "γ");
		map.put("delta", "δ");
		map.put("epsilon", "ε");
		map.put("zeta", "ζ");
		map.put("eta", "η");
		map.put("theta", "θ");
		
		System.out.println(map.getClass());
		map.forEach((key, value) -> {
			System.out.println(key + " = " + value);
		});
	}
	public static void main(String[] args) {
		testMap(new HashMap<String, String>());
		testMap(new TreeMap<String, String>());
		testMap(new LinkedHashMap<String, String>());
	}
	//HashMapではキーの並び順は不定
	//TreeMapではキーの並び順は辞書順
	//LinkedHashMapではキーの並び順は追加順
}