package com.example.demo.leethack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class CousinNode {

	public static int getlevelntil(TreeNode root, int data, int level) {
		if (root == null) {
			return 0;
		}
		if (root.val == data) {
			return level;
		}
		int downLevel = getlevelntil(root.left, data, level + 1);
		if (downLevel != 0) {
			return downLevel;
		}
		downLevel = getlevelntil(root.right, data, level + 1);
		return downLevel;
	}

	public static int getLevel(TreeNode root, int data) {
		return getlevelntil(root, data, 1);
	}

	public static int findParent(TreeNode root, int val, int parent) {
		if (root == null) {
			return -1;
		}
		if (root.val == val) {
			return parent;
		} else {
			findParent(root.left, val, root.val);
			findParent(root.right, val, root.val);
		}
		return parent;

	}

	public boolean isCousins(TreeNode root, int x, int y) {
		// find depth if same then find parent if different true else false

		int xlev = getLevel(root, x);
		int ylev = getLevel(root, y);
		int xpar = findParent(root, x, root.val);
		int ypar = findParent(root, y, root.val);
		if ((xlev == ylev) && (xpar != ypar)) {
			return true;
		}
		else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
