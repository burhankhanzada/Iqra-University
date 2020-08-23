class BinaryNode {

    int data;
    BinaryNode left, right;

    BinaryNode(int data) {
        this.data = data;
    }

    void insertLeft(int data) {
        if (left == null)
            left = new BinaryNode(data);
        else System.out.println("Left node already exist");
    }

    void insertRight(int data) {
        if (right == null)
            right = new BinaryNode(data);
        else System.out.println("Right node already exist");
    }

    void removeNode() {
        if (left != null && right != null) {
            System.out.println("Can't remove child nodes exist");
        } else if (left != null) {
            data = left.data;
            left = null;
        } else if (right != null) {
            data = right.data;
            right = null;
        } else System.out.println("child nodes doesn't exist");
    }

}
