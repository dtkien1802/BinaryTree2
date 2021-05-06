public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        Ex5 test = new Ex5();

        int result = test.findLCA(bt.root, 7, 9);

        //In cay
        System.out.println(bt);

        //Tim LCA bai 5
        System.out.println(result);
    }
}
