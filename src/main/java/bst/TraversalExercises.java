package bst;

import java.util.*;

public class TraversalExercises {

    // Iterative preorder using a stack
    public static <T extends Comparable<T>> List<T> preorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO: implement iterative preorder using Deque as a stack
        if (root == null) return result;

        Deque<TreeNode<T>> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode<T> node = stack.pop();
            result.add(node.getValue());
            if (node.getRight() != null) stack.push(node.getRight());
            if (node.getLeft() != null) stack.push(node.getLeft());
        }
        return result;
    }

    // Iterative inorder using a stack
    public static <T extends Comparable<T>> List<T> inorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO: implement iterative inorder
        // Hint: use a pointer 'curr' and a stack:
        Deque<TreeNode<T>> stack = new ArrayDeque<>();
        TreeNode<T> curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.getLeft();
            }
            curr = stack.pop();
            result.add(curr.getValue());
            curr = curr.getRight();
        }

        return result;
    }

    // Optional / challenge: iterative postorder
    public static <T extends Comparable<T>> List<T> postorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        if  (root == null) return result;
        Stack<TreeNode<T>> stack1 = new Stack<>();
        Stack<TreeNode<T>> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode<T> node = stack1.pop();
            stack2.push(node);
            if (node.getLeft() != null) stack1.push(node.getLeft());
            if (node.getRight() != null) stack1.push(node.getRight());
        }
        while (!stack2.isEmpty()) {
            result.add(stack2.pop().getValue());
        }
        return result;
    }

    // Practice version of level-order
    public static <T extends Comparable<T>> List<T> levelOrderUsingQueue(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode<T>> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.poll();
            result.add(node.getValue());
            if (node.getLeft() != null) queue.offer(node.getLeft());
            if  (node.getRight() != null) queue.offer(node.getRight());
        }
        return result;
    }
}

