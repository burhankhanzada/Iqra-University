class BinaryTree {

    BinaryNode root;

    public BinaryTree(int data) {
        root = new BinaryNode(data);
    }

    void process(BinaryNode n) {
        System.out.println(n.data);
    }

    void preOrderVisit(BinaryNode n) {
        if (n == null) return;
        process(n);
        preOrderVisit(n.left);
        preOrderVisit(n.right);

    }

    void inOrderVisit(BinaryNode n) {
        if (n == null) return;
        inOrderVisit(n.left);
        process(n);
        inOrderVisit(n.right);
    }

    void postOrderVisit(BinaryNode n) {
        if (n == null) return;
        postOrderVisit(n.left);
        postOrderVisit(n.right);
        process(n);
    }

}
