package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree extends TreeService {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);

        }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 90);
        tree.insert(tree.root, 60);
        System.out.println("Inorder Traversal:");
        //inOrderIterative(tree.root);
        //TreeService.countLeaf(tree.root);
        System.out.println(tree.searchForElement(tree.root, 60));
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) root.left = insert(root.left, value);
        else if (value > root.data) root.right = insert(root.right, value);
        return root;
    }
}
