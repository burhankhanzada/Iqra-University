public class Main {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(6);

        BinaryNode root = binaryTree.root;

        root.insertLeft(5);
        root.insertRight(7);

        BinaryNode rootLeft = binaryTree.root.left;
        BinaryNode rootRight = binaryTree.root.right;

        rootLeft.insertLeft(3);
        rootLeft.insertRight(4);

        rootRight.insertLeft(8);
        rootRight.insertRight(9);

        binaryTree.inOrderVisit(root);

        System.out.println("");

        rootRight.insertRight(10); // to check method condition

        System.out.println("");

        BinaryNode rootLeftFirstLeft = rootLeft.left;

        rootLeftFirstLeft.insertLeft(1);

        binaryTree.preOrderVisit(root);

        System.out.println("");

        binaryTree.inOrderVisit(root);

        System.out.println("");

        binaryTree.postOrderVisit(root);

        System.out.println("");

        rootLeft.removeNode();
        rootLeftFirstLeft.removeNode();

        System.out.println("");

        binaryTree.inOrderVisit(root);

    }

}
