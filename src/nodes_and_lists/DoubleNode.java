/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodes_and_lists;

/**
 *
 * @author PC
 */
public class DoubleNode<T> {
    private T value;
    private DoubleNode<T> next;
    private DoubleNode<T> prev;

    public void setNext(DoubleNode<T> node) {
        this.next = node;
    }

    public DoubleNode<T> getNext() {
        return this.next;
    }

    public void setPrev(DoubleNode<T> node) {
        this.prev = node;
    }

    public DoubleNode<T> getPrev() {
            return this.prev;
    }

    public DoubleNode(T value) {
        this.value = value;
    }

    public void setValue(T newValue) {
        this.value = newValue;
    }

    public T getValue() {
        return this.value;
    }


    public String toString() {
            return (prev != null ? prev.getValue() : null) + "<-" + this.value + "->" + (next != null ? next.getValue() : null);
    }

}
