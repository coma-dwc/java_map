package map_method;

//putメソッド
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "Apple");
		map.put("b", "Banana");
		System.out.println(map);
	}
}