import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    private List<Integer> path1 = new ArrayList<>();
    private List<Integer> path2 = new ArrayList<>();

    private boolean findPath(Node root, int n, List<Integer> path) {
        if (root == null) {
            return false;
        }

        path.add(root.value);

        if (root.value == n) {
            return true;
        }

        if (root.left != null && findPath(root.left, n, path)) {
            return true;
        }

        if (root.right != null && findPath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size()-1);

        return false;
    }

    private int findLCAInternal(Node root, int n1, int n2) {
        if(!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            System.out.println((path1.size() > 0) ? "n1 ton tai" : "n1 khong ton tai");
            System.out.println((path2.size() > 0) ? "n2 ton tai" : "n2 khong ton tai");
        }

        int i;
        for ( i = 0; i < path1.size() && i < path2.size(); i++) {
            if(!path1.get(i).equals(path2.get(i)))
                break;
        }

        return path1.get(i-1);
    }

    int findLCA(Node root, int n1, int n2) {
        path1.clear();
        path2.clear();
        return findLCAInternal(root, n1, n2);
    }
}
