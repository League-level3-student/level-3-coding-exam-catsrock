import java.util.HashMap;

public class HashMapCalculator {
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {

		int count = 0;
		for (String key : hashmap1.keySet()) {
			if (hashmap1.containsKey(key)) {

				if (hashmap1.get(key).equals(hashmap2.get(key))) {
					count++;
				}
			} else {

			}
		}
		return count;
		
	}
}