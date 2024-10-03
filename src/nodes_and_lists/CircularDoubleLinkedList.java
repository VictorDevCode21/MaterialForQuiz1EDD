/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodes_and_lists;

/**
 *
 * @author PC
 */
public class CircularDoubleLinkedList<T> {

    private DoubleNode<T> first;
    private int size;

    public CircularDoubleLinkedList() {
        first = null;
        size = 0;
    }

    /* Add at the end */
    public void add(T value) {
        DoubleNode<T> newNode = new DoubleNode<>(value);

        if (first == null) {  
            first = newNode;
            newNode.setNext(first);  
            newNode.setPrev(first);  
        } else {
            DoubleNode<T> last = first.getPrev();  
            last.setNext(newNode);
            newNode.setPrev(last);
            newNode.setNext(first); 
            first.setPrev(newNode);  
        }
        size++;
    }

    /* Delete node */
    public void remove(T value) {
        if (first == null) {
            return; 
        }
        DoubleNode<T> current = first;

        do {
            if (current.getValue().equals(value)) {
                if (current == first && current.getNext() == first) { 
                    first = null;
                } else {
                    DoubleNode<T> prevNode = current.getPrev();
                    DoubleNode<T> nextNode = current.getNext();

                    prevNode.setNext(nextNode);
                    nextNode.setPrev(prevNode);

                    if (current == first) { 
                        first = nextNode;
                    }
                }
                size--;
                return;
            }
            current = current.getNext();
        } while (current != first);
    }

    /* Find value */
    public boolean contains(T value) {
        if (first == null) {
            return false;
        }

        DoubleNode<T> current = first;
        do {
            if (current.getValue().equals(value)) {
                return true;
            }
            current = current.getNext();
        } while (current != first);

        return false;
    }

    /* Turns into a double list (non-circular) */
    public void toDoubleList() {
        if (first == null) {
            return;
        }

        DoubleNode<T> last = first.getPrev();
        last.setNext(null);
        first.setPrev(null);
    }

    /* Print elements */
    public void print() {
        if (first == null) {
            System.out.println("Empty List.");
            return;
        }

        DoubleNode<T> current = first;
        do {
            System.out.print(current.getValue() + " <-> ");
            current = current.getNext();
        } while (current != first);

        System.out.println("(Back to first)");
    }

    public int getSize() {
        return size;
    }

}
