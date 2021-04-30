
public class TrieTest {
		public static void main(String[] args) {
			Trie tri = new Trie();
			
			
			tri.insert("aui", "WEAK", 0);
			
			System.out.println(tri.get("aui", 0));
			tri.remove("aui", 0);
			System.out.println(tri.get("aui", 0));
				
			
			tri.insert("aui", "WEAKxD", 0);
			
			System.out.println(tri.get("aui", 0));
			
			tri.insert("au", "xD", 0);
			System.out.println(tri.get("au", 0));
		}
}
