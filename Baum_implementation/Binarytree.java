package Baum_implementation;

public class Binarytree {

    public Node rootNode;


    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.leftNode = addRecursive(current.leftNode, value);
        } else if (value > current.value) {
            current.rightNode = addRecursive(current.rightNode, value);
        } else {
            return current;
        }

        return current;
    }


    public void add(int value) {
        rootNode = addRecursive(rootNode, value);
    }

    public void traversInOrder(Node node) {
        if (node != null) {
            traversInOrder(node.leftNode);
            System.out.println("Wert: " + node.value);
            traversInOrder(node.rightNode);
        }
    }

    public boolean containsNode(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (current.value == value) {
            System.out.println("Wert Gefunden");
            return true;
        }

        if (value < current.value) {
            containsNode(current.leftNode, value);
        } else {
            containsNode(current.rightNode, value);
        }

        return false;
    }


    public Node deleteNodes(Node current, int value) {
        if (current == null) {
            return null;
        }
        if (current.value == value) {
            if (current.rightNode == null && current.leftNode == null){
                return null;
            }
            if (current.rightNode == null){
                return current.leftNode;
            }
            if (current.leftNode == null){
                return current.rightNode;
            }

            int smallestValue = findSmallestValue(current.rightNode);
            current.value = smallestValue;
            current.rightNode = deleteNodes(current.rightNode, value);
            return current;

        }

        if (value < current.value) {
            deleteNodes(current.leftNode, value);
            return current;
        } else {
            deleteNodes(current.rightNode, value);
            return current;
        }
    }

    private int findSmallestValue(Node node){
        if (node.leftNode == null){
            return node.value;
        } else {
            return findSmallestValue(node.leftNode);
        }


    }

}
