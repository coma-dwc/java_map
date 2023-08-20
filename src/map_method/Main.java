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
//		System.out.println(map.get("a"));
//		System.out.println(map.get("c"));
		//指定されたキーがMapに登録されていない場合はnullが返る
		
		
		//getOrDefaultメソッド
		//キーに対応する値がない場合のデフォルト値を指定してMapから値を取得
//		System.out.println(map.getOrDefault("a", "Anime"));
//		System.out.println(map.getOrDefault("c", "Cartoon"));
		
		
		//sizeメソッド
		//Mapに登録されているキーと値のペアの数を取得
//		System.out.println(map.size());
		
		
		//containsKeyメソッド
		//Mapに指定のキーが登録されているかどうかを取得
//		System.out.println(map.containsKey("a"));
//		System.out.println(map.containsKey("c"));
		
		
		//containsValueメソッド
//		System.out.println(map.containsValue("Apple"));
//		System.out.println(map.containsValue("Cherry"));
		
		
		//putAllメソッド
		//Mapに別のMapの内容を全て追加
//		Map<String, String> map2 = new HashMap<String, String>();
//		map2.put("c", "Cherry");
//		map2.put("d", "Donut");
//		
//		map.putAll(map2);
//		System.out.println(map);
		
		
		//putIfAbsentメソッド
		//Mapにキーに対応する値がない場合だけ値を追加
//		map.putIfAbsent("a", "Almond");
//		map.putIfAbsent("c", "Cherry");
//		System.out.println(map);
		
		
		//remove(key)メソッド
		//Mapから値を削除
//		map.remove("a");
//		System.out.println(map);
		
		
		//remove(key, value)メソッド
		//Mapからキーに対応する値が指定の値の場合のみ削除
//		map.remove("a", "Almond");
//		map.remove("b", "Banana");
//		System.out.println(map);
		
		
		//clearメソッド
		//Mapをクリアする
		map.clear();
		System.out.println(map);
	}
}