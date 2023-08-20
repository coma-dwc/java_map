package map_method;

//putメソッド
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "Apple");
		map.put("b", "Banana");
		
		//getメソッド Mapから値を取り出す
		System.out.println(map.get("a"));
		System.out.println(map.get("c"));
		//指定されたキーがMapに登録されていない場合はnullが返る
	}
}