package map_repeat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "Apple");
		map.put("b", "Banana");
		map.put("c", "Cherry");
		map.put("d", "Donut");
		map.put("e", "Egg");
		
		Iterator<String> it = map.keySet(). iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
	}
}