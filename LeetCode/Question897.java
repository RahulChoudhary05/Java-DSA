//https://leetcode.com/problems/increasing-order-search-tree/description/

/*Increasing Order Search Tree
Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

Example 1:
https://assets.leetcode.com/uploads/2020/11/17/ex1.jpg

Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]*/

package LeetCode;

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Question897 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        System.out.println("Enter the values of the nodes:");
        TreeNode root = new TreeNode(scanner.nextInt());
        TreeNode current = root;
        for (int i = 1; i < n; i++) {
            current.right = new TreeNode(scanner.nextInt());
            current = current.right;
        }

        System.out.println("Original Tree:");
        printTree(root);

        TreeNode result = increasingBST(root);
        System.out.println("Transformed Tree:");
        printTree(result);

        scanner.close();
    }

    public static TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode(-1);
        current = newRoot;
        inorder(root);
        return newRoot.right;
    }

    static TreeNode current;
    public static void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        node.left = null;
        current.right = node;
        current = node;
        inorder(node.right);
    }

    public static void printTree(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
        System.out.println();
    }
}

