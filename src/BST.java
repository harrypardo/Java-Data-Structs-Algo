
public class BST {
	
	
		public static void main(String[] args) {
			BST tree = new BST();
			tree.insert(50, "Apple");
			tree.insert(30, "Banana");
			tree.insert(20, "Pear");
			tree.insert(40, "Mango");
			tree.insert(70, "Grape");
			tree.insert(60, "Orange");
			tree.insert(80, "Peach");
			
			tree.inOrder();
			
			System.out.println("--------------");
			
			
			tree.preOrder();
			
			System.out.println("--------------");
			
			
			tree.postOrder();
			
			System.out.println("--------------");
		}
	
		Node root;
		static class Node {
			
			int key;
			Node left, right;
			String value;
			
			
			public Node(int key, String value) {
				this.key = key;
				this.value = value;
				left = right = null;
			}
			
			void clear() {
				left = right = null;
			}
		}
		
		
		void insert(int key, String value) {
			root = insertRec(key , value, root);
		}
		
		Node insertRec(int key , String value, Node root) {
			if(root == null) return new Node(key, value);
			if(key > root.key) root.right = insertRec(key, value, root.right);
			else root.left = insertRec(key, value, root.left);
			return root;
		}
		Node get(int value) {
			return getRec(value, root);
			
		}
		
		
		void inOrder() {
			inOrderRec(root);
		}
		void inOrderRec(Node root) {
			if(root != null) {
				inOrderRec(root.left);
				System.out.println(root.key + " " + root.value);
				inOrderRec(root.right);
			}
		}
		
		
		
		void preOrder() {
			preOrderRec(root);
		}
		void preOrderRec(Node root) {
			if(root != null) {
				System.out.println(root.key + " " + root.value);
				preOrderRec(root.left);
				preOrderRec(root.right);
			}
		}
		
		void postOrder() {
			postOrderRec(root);
		}
		void postOrderRec(Node root) {
			if(root != null) {
			
				postOrderRec(root.left);
				postOrderRec(root.right);
				System.out.println(root.key + " " + root.value);
			}
		}
		
		Node getRec(int key, Node root) {
			if(root == null) return null;
			if(key == root.key) return root;
			if(key > root.key) return getRec(key, root.right);
			else return getRec(key, root.left);
		}
		
}
