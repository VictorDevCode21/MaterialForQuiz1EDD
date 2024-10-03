/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodes_and_lists;

/**
 *
 * @author PC
 */
public class DoubleNode {
    private int value;
    private DoubleNode next;
    private DoubleNode prev;

    public void setNext(DoubleNode node) {
        this.next = node;
    }

    public DoubleNode getNext() {
        return this.next;
    }

    public void setPrev(DoubleNode node) {
        this.prev = node;
    }

    public DoubleNode getPrev() {
            return this.prev;
    }

    public DoubleNode(int value) {
        this.value = value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return this.value;
    }


    public String toString() {
            return (prev != null ? prev.getValue() : null) + "<-" + this.value + "->" + (next != null ? next.getValue() : null);
    }

}
