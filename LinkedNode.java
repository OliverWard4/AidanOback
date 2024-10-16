package AidanOback;

public class LinkedNode {

    private int data;
    private LinkedNode next;
    private LinkedNode back;

    // constructors
    public LinkedNode(int data, LinkedNode next, LinkedNode back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    public LinkedNode(int data, LinkedNode next) {
        this.data = data;
        this.next = next;
        this.back = null;
    }

    public LinkedNode(int data) {
        this.data = data;
        next = null;
        back = null;
    }

    // returns the data of a node
    public int getData() {
        return data;
    }

    // sets the data of a node
    public void setData(int data) {
        this.data = data;
    }

    // returns the address of a next
    public LinkedNode getNext() {
        return next;
    }

    // sets the address of a next
    public void setNext(LinkedNode next) {
        this.next = next;
    }

    public LinkedNode getBack() {
        return back;
    }

    // sets the address of a next
    public void setBack(LinkedNode back) {
        this.back = back;
    }
}
