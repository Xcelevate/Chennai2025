package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeService {


    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void preOrderIterative(Node root) {
        if (root == null) return;
        Stack<Node> q = new Stack<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.pop();
            System.out.println(node.data + " ");
            if (node.right != null) q.add(node.right);
            if (node.left != null) q.add(node.left);
        }
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void inOrderIterative(Node root) {
        if (root == null) return;
        Stack<Node> st = new Stack();
        st.add(root);
        Node node = st.pop();
        while (!st.isEmpty() || node != null) {
            while (node != null) {
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            System.out.print(node.data + " ");
            node = node.right;
        }
    }

    public static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void postorderIterative(Node root) {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        Stack<Node> output = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            output.push(curr);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        while (!output.isEmpty()) {
            System.out.print(output.pop().data + " ");
        }
    }

    public static void countLeaf(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.left == null && node.right == null) count += 1;
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
        System.out.println(count);
    }

    public Boolean searchForElement(Node node, int target) {

        if (node == null) return false;
        if (node.data == target) return true;
        if (target < node.data) return searchForElement(node.left, target);
        else return searchForElement(node.right, target);
    }
}
