public class BSTree {
    //field/attribute/instance variable
    BNode root;

    //constructors (overloaded)
    public BSTree(int data) {
        BNode newNode = new BNode(data);
        root = newNode;
        System.out.println("--> Inserted " + data + " as the root");
    }

    public BSTree(BNode newNode) {
        root = newNode;
    }

    public boolean isEmpty() {
        return root == null;
    }
    public void addNode(int data) {
        BNode newBNode = new BNode(data);
        addNode(root, newBNode);
    }

    public void addNode(BNode newBNode) {
        addNode(root, newBNode);
    }

    public void addNode(BNode node, BNode newNode) {
        if(newNode.data < node.data) {
            if(node.left != null) {
                addNode(node.left, newNode);
            } else {
                System.out.println("--> Inserted " + newNode.data +
                        " to the left of " + node.data);
                node.left = newNode;
            }
        } else if(newNode.data > node.data) {
            if(node.right != null) {
                addNode(node.right, newNode);
            } else {
                System.out.println("--> Inserted " + newNode.data +
                        " to the right of " + node.data);
                node.right = newNode;
            }
        }
    }

    public boolean search(int data) {

        return false;
    }


}
