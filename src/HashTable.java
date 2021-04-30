
public class HashTable {
			
	
	LinkedList[] table;
	int max;
	
	HashTable(int max) {
		this.max = max;
		table = new LinkedList[max];
	}
	
	int hash(String key) {
		int h = 7;
		for(int i =0; i < key.length(); i++) {
			h = h * 31 + key.charAt(i);
			
		}
		if(h < 0) h *= -1;
		return h % max;
	}
	
	void insert(String key, String value) {
		int index = hash(key);
		
		if(table[index] == null)  table[index] = new LinkedList(); 
			
		table[index].addToTail(key, 
				value);
		
		
	}
	
	String get(String key) {
		int index = hash(key);
		if(table[index] ==null) return "";
		return table[index].get(key);
	}
	 
}
