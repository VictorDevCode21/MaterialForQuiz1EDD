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

    public DoubleNode<T> getLast() {
        return this.last;
    }

    public void setLast(DoubleNode<T> last) {
        this.last = last;
    }

    /**
     * @return the first
     */
    public DoubleNode<T> getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(DoubleNode<T> first) {
        this.first = first;
    }

    /*Adds new nodes to the list*/
    public void add(T value) {
        DoubleNode<T> node = new DoubleNode<>(value);

        if (size == 0) { // Empty List
            setFirst(node);
            last = node;
        } else { // Not Empty List
            last.setNext(node);
            node.setPrev(last);
            last = node;

        }
        size++;
    }

    public void add(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    public void remove(T value) {
        if (first == null) {
            return;
        }

        if (first.getValue().equals(value)) {
            first = first.getNext();  
            if (first != null) {
                first.setPrev(null);  
            }
            size--;  
            return;
        }

        DoubleNode<T> current = first;

        while (current != null && !current.getValue().equals(value)) {
            current = current.getNext();
        }

    
        if (current == null) {
            return;
        }

        
        if (current.getPrev() != null) {
            current.getPrev().setNext(current.getNext());
        }

        if (current.getNext() != null) {
            current.getNext().setPrev(current.getPrev());
        }

        size--; 
    }

    public void print() {
        DoubleNode node = getFirst();
        String s = "";

        while (node != null) {
            s += "<-" + node.getValue() + "->";
            node = node.getNext();
        }

        System.out.println(s + "\b\b");

    }

}
