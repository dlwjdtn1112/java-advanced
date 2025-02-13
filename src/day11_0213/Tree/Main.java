package day11_0213.Tree;

public class Main {
    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(2);
        myTree.insertNode(1);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(5);
        myTree.insertNode(6);
        System.out.println(myTree.head.left.left.value);
        //System.out.println(myTree.head.right.right.right.value);






    }
}
