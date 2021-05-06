public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private String preOrder(Node current) {
        if (current == null) {
            return "";
        } else {
            if (current.left == null && current.right == null) {
                return String.valueOf(current.value);
            } else {
                return String.valueOf(current.value) + "(" + preOrder(current.left) + preOrder(current.right) + ")";
            }
        }
    }

    public String toString() {
        if (root == null) {
            return "an empty tree";
        } else {
            return preOrder(root);
        }
    }
}
