import java.util.*;

public class LevelOrderTraversalQuestion102 {

    public class TreeNode {
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

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> wrapList = new LinkedList<>();
            if (root == null) {
                return wrapList;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int levelNum = queue.size();
                List<Integer> sublist = new ArrayList<>();

                for (int i = 0; i < levelNum; i++) {
                    TreeNode currentNode = queue.poll();
                    sublist.add(currentNode.val);

                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }

                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                wrapList.add(sublist);
            }
            return wrapList;
        }
    }
}
