/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodes_and_lists;

/**
 *
 * @author PC
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node newNext) {
        this.next = newNext;
    }

    public String toString() {
        return "value: "+ value + " Next: " + (next != null ? getNext().value : null);
    }
}
