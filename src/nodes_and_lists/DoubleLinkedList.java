/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodes_and_lists;

/**
 *
 * @author PC
 */
public class DoubleLinkedList<T> {
    private DoubleNode<T> first;
    private DoubleNode<T> last;
    private int size;

    public DoubleLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    /*Returns the size of the List*/
    public int getSize() {
        return this.size;
    }

    /*Adds new nodes to the list*/
    public void add(T value) {
        DoubleNode<T> node = new DoubleNode<>(value);

        if (size == 0) { // Empty List
            first = node;
            last = node;
        } else { // Not Empty List
            last.setNext(node);
            node.setPrev(last);
            last = node;

        }
        size ++;
    }

    public void add(T ...values) {
        for (T value : values) {
            add(value);
        }
    }

    public void print() {
        DoubleNode node = first;
        String s = "";

        while (node != null) {
            s += "<-" + node.getValue() + "->";
            node = node.getNext();
        }

        System.out.println(s + "\b\b");

    }
}
