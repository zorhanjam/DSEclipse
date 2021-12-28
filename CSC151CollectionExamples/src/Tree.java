
public class Tree {
	Node root;

	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public Node insertLevelOrder(int[] arr, Node root, int i) {
		if (i < arr.length) {
			Node temp = new Node(arr[i]);
			root = temp;
			root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
			root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
		}
		return root;
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void posOrder(Node root) {
		if (root != null) {
			posOrder(root.left);
			posOrder(root.right);
			System.out.print(root.data + " ");
		}

	}

	public int height(Node root) {
		if (root != null)
			return 1 + height(root.left);
		return 0;
	}

	public void displaySpaces(int h) {
		int hm = h / 3;		
		if (h > 0) {
			for (int i = 1; i < hm; i++)
				System.out.print("| ");
			System.out.print("|_");
		}
	}

	public void display(Node root, int h) {
		if (root != null) {
			displaySpaces(h);
			System.out.println(root.data);
			display(root.left, h + 3);
			display(root.right, h + 3);
		}
	}

	public static void main(String args[]) {
		Tree t2 = new Tree();
		int arr[] = { 6, 0, 1, 3, 6, 5, 4, 7, 9, 2 };
		t2.root = t2.insertLevelOrder(arr, t2.root, 0);
		t2.inOrder(t2.root);
		System.out.println();
		t2.preOrder(t2.root);
		System.out.println();
		t2.posOrder(t2.root);
		System.out.println();
		t2.display(t2.root, 0);

	}
}
