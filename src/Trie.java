
public class Trie {
		Trie[] children;
		boolean end;
		String info;
		
		public Trie() {
			children = new Trie[26];
			end = false;
		}
		
		
		void insert(String key, String info, int pos) {
			if(pos == key.length()) {
					end = true;
					this.info = info;
			}	else {
				int index =  key.charAt(pos) - 'a';
				if(children[index] == null) children[index] = new Trie();
				children[index].insert(key, info, pos + 1);
			}
		}
		
		String get(String key, int pos) {
			if(pos == key.length()) {
				if(end) return info;
				else return "";
			} else {
				int index =  key.charAt(pos) - 'a';
				if(children[index] == null) return "";
				return children[index].get(key, pos + 1);
			}
		}
		
		void remove(String key, int pos) {
			if(pos == key.length()) {
				end = false;
				info = "";
			} else {
				int index =  key.charAt(pos) - 'a';
				if(children[index] == null) return;
				children[index].remove(key, pos + 1);
			}
		}
}
