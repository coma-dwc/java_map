package map_make;

//HashMapの作成
//Mapとプリミティブ型(整数(int = Integer)をキーとするMapを作成)
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		System.out.println(map);
	}
}


//TreeMapの作成;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class Main {
//	public static void main(String[] args) {
//		Map<String, String> map = new TreeMap<>();
//		System.out.println(map);
//	}
//}


//LinkedHashMapの作成
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class Main {
//	public static void main(String[] args) {
//		Map<String, String> map = new LinkedHashMap<>();
//		System.out.println(map);
//	}
//}