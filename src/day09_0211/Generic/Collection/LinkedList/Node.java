package day09_0211.Generic.Collection.LinkedList;

public class Node<T> {
    T data;
    Node<T> next = null;


    public Node(T data) {
        this.data = data;

    }
}
