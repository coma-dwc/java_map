package java_collections;

import java.util.Collections;
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
		
		
		//Collections.unmodifiableMapを使用して変更不可のListを取得
		Map<String, String> map2 = Collections.unmodifiableMap(map);
		map2.put("f", "Fish");
	}
}