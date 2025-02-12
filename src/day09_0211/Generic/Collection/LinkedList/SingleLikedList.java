package day09_0211.Generic.Collection.LinkedList;

public class SingleLikedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        day09_0211.Generic.Collection.LinkedList.Node<T> next = null;


        public Node(T data) {
            this.data = data;

        }
    }

    public void addNode(T data){
        if(head == null){
            head= new Node<T>(data);
        }
        else{
            Node<T>node = this.head;
            while(node.next != null){
                //node = this.node;
            }
        }
    }
}
