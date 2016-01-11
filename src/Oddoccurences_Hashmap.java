import java.util.HashMap;
public class Oddoccurences_Hashmap {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			int key=arr[i];
			
			if(map.containsKey(key)) {
			int value=map.get(key);
			value++;
			map.put(key, value);
			}
			else
				map.put(key,1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			
		}
	}

}
